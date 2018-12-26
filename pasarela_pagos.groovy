job("Pasarela_pagos") {
	description("Pruebas automatizadas proyecto de pasarela de pagos.")
  parameters {
        stringParam('URL1', 'https://transaccionesco-uat.tigocloud.net', 'URL base para TRANSACCIONES-CO, ingrese la URL del ambiente a probar (stage-uat-producción)')
    	stringParam('URL2', 'https://tigoselfcareregional-uat-co.tigocloud.net', 'URL base SELFCARE REGIONAL, ingrese la URL del ambiente a probar (stage-uat-producción)')
        choiceParam('ETIQUETA', ['', '@CasoFeliz', '@Pasarela', '@Recargas', '@Paquetes'],'Se ejecutará solo la etiqueta seleccionada, por defecto se ejecutaran todas las pruebas')
    	choiceParam('NAVEGADOR', ['chrome', 'firefox', 'iexplorer'],'Navegador de ejecución de pruebas')
    }
	keepDependencies(false)
	multiscm {
		git {
			remote {
				name('metis')
				url('ssh://git@code.tigocloud.net/diffusion/137/metis.git')
				credentials("e220c410-6ce3-4c0c-b7bc-1a14eeeb1d6c")
				branch("*/master")
              	extensions {
              		relativeTargetDirectory('metis')
              	}
			}
		}
		git {
			remote {
				name('transaccionales-co')
				url('ssh://git@code.tigocloud.net/diffusion/TRXCO/transaccionales-co.git')
				credentials("e220c410-6ce3-4c0c-b7bc-1a14eeeb1d6c")
				branch("*/master")
              	extensions {
              		relativeTargetDirectory('transaccionales-co')
              	}
			}
		}
		git {
			remote {
				name('tigoselfcareregional')
				url('ssh://git@code.tigocloud.net/diffusion/84/tigoselfcareregional.git')
				credentials("e220c410-6ce3-4c0c-b7bc-1a14eeeb1d6c")
				branch("*/master")
              	extensions {
              		relativeTargetDirectory('tigoselfcareregional')
              	}
			}
		}
	}
	disabled(false)
    triggers {
          githubPush()
      }

  concurrentBuild(false)

	steps {
		shell('chmod a+x metis/automatizacion_base/src/test/resources/driver/*')
    }

	steps {
		configure {
			node->
			node / builders / 'hudson.tasks.Maven' {
				targets('clean install')
				mavenName('(Default)')
				pom('metis/automatizacion_base/')
				properties('chrome.switches=--headless\nwebdriver.chrome.driver=src/test/resources/driver/chromedriver\nwebdriver.driver=\${NAVEGADOR}\nwebdriver.remote.driver=\${NAVEGADOR}\ntags=${ETIQUETA}\nbaseURL1=${URL1}\nbaseURL2=${URL2}')
				usePrivateRepository('false')
				injectBuildVariables('false')
			}
		}
    }
	
	steps {
      shell('chmod a+x metis/publicacionEvidencias.sh')
	  shell('chmod a+x metis/unitTests/ejecucionUnitTests_transaccionales.sh')
	  shell('chmod a+x metis/unitTests/ejecucionUnitTests_tigoSelfcare.sh')
	  
      shell('metis/publicacionEvidencias.sh')
      shell('metis/unitTests/ejecucionUnitTests_transaccionales.sh')
      shell('metis/unitTests/ejecucionUnitTests_tigoSelfcare.sh')
    }

	configure {
		node->
		node / builders << 'hudson.plugins.sonar.SonarRunnerBuilder' {
			project('')
			properties('project.settings=metis/sonarMetis.properties')
			javaOpts('')
			additionalArguments('')
			jdk('')
			task('')
		}
	}
		
	configure {
		node->
		node / builders << 'hudson.plugins.sonar.SonarRunnerBuilder' {
			project('')
			properties('project.settings=metis/sonarTransaccionales.properties')
			javaOpts('')
			additionalArguments('')
			jdk('')
			task('')
		}
	}

	configure {
		node->
		node / builders << 'hudson.plugins.sonar.SonarRunnerBuilder' {
			project('')
			properties('project.settings=metis/sonarSelfcare.properties')
			javaOpts('')
			additionalArguments('')
			jdk('')
			task('')
		}
	}
	
	publishers {
		configure {
			node->
			node / publishers / 'jenkins.plugins.slack.SlackNotifier' {		
				  baseUrl('https://metisgrupo.slack.com/services/hooks/jenkins-ci/')
				  teamDomain('')
				  authToken('OKzRnYp2kaVzfPY8ySNtx0qD')
				  authTokenCredentialId('')
				  botUser('false')
				  room('#General')
				  startNotification('true')
				  notifySuccess('true')
				  notifyAborted('true')
				  notifyNotBuilt('true')
				  notifyUnstable('true')
				  notifyRegression('true')
				  notifyFailure('true')
				  notifyBackToNormal('true')
				  notifyRepeatedFailure('true')
				  includeTestSummary('true')
				  includeFailedTests('true')
				  commitInfoChoice('NONE')
				  includeCustomMessage('false')
				  customMessage('hola Metis!')
			}
		}
	
      	archiveJunit("metis/automatizacion_base/target/reports/junit.xml") {
			healthScaleFactor(1.0)
			allowEmptyResults(false)
		}
	}
}