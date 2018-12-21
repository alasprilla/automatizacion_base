job("phpunit pasarela") {
	description("Pruebas automatizadas proyecto de pasarela de pagos.")
	keepDependencies(false)
	multiscm {
		git {
			remote {
				name('metis')
				url('ssh://git@code.tigocloud.net/diffusion/137/metis.git')
				credentials("e220c410-6ce3-4c0c-b7bc-1a14eeeb1d6c")
				branch("*/dev")
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
				branch("*/dev")
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
				branch("*/dev")
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
      shell('chmod a+x metis/unitTests/ejecucionUnitTests.sh')
      shell('metis/unitTests/ejecucionUnitTests.sh')
    }
	
}