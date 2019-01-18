<?php
	error_reporting(E_ERROR | E_PARSE);
	# Discriminacion de lectura de parametro segun sea cliente o web
	if (PHP_SAPI === 'cli') {
		echo "Esta usando un cliente <br>\n";
		$nombre = $argv[1];
	} else {
		echo "Está usando un navegador Web <br>\n";
		$nombre=$_GET['parametro'];
	}
	echo "parametro=$nombre <br>\n";
	$archivo1=$nombre;
	$lectura = fopen($archivo1, "r");
	$i=1;
	$resp1=array();

	if($lectura){
		echo "Leyendo archivo...";
		print(" <br>\n");
		while(!feof($lectura)){
			$linea =trim(fgets($lectura));
			if((strpos($linea, "Tests run:") !== false) || (strpos($linea, "Tests:") !== false)){
				echo "Se encontro la linea: $linea";
				
				$items = explode(", ", $linea);
				$map = array_map();
				$text="";
				foreach ($items as $row) {
					$text.="$row\n";
					$keyValue = explode(": ", $row);
					$map[$keyValue[0]][] = $keyValue[1];
				}
				
				$Test=(int) ($map['Tests'][0]);
				if($Test < 1){
					$Test=(int)($map['Tests run'][0]);
				}
				$Errors=$map['Errors'][0];
				$Failures=$map['Failures'][0];
				$color="#36a64f";
				if((($Error/$Test)>0.15)||((($Failures/$Test)>0.15))){
					$color="#ff0000";
				}elseif((($Error/$Test)>0.05)||((($Failures/$Test)>0.05))){
					$color="#e08114";
				}
				
				print(" <br>\n");
				print("_____________________ <br>\n");
				print("Test: $Test <br>\n");
				print("Error: $Errors <br>\n");
				print("Failures: $Failures <br>\n");
				print("color: $color <br>\n");
				
				$resp1['text']=$text;
				$resp1['pretext']=$linea;
				$resp1['color']=$color;
			}
			$i++; 
		}
		fclose($lectura);
		$data_string=json_encode($resp1);
		$resp2=array();
		$data_string= '{"attachments":[' . json_encode($resp1) . ']}';
		
		print(" <br>\n");
		print("Json: ");
		print_r($data_string);
		print(" <br>\n");
		
		
		//#Alexand 'https://hooks.slack.com/services/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';
		//#General 'https://hooks.slack.com/services/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';
		$url = 'https://hooks.slack.com/services/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';
		$ch = curl_init( $url );
		# Setup request to send json via POST.
		curl_setopt( $ch, CURLOPT_POSTFIELDS, $data_string );
		curl_setopt( $ch, CURLOPT_HTTPHEADER, array('Content-Type:application/json'));
		# Return response instead of printing.
		curl_setopt( $ch, CURLOPT_RETURNTRANSFER, true );
		# Send request.
		$result = curl_exec($ch);
		curl_close($ch);
		# Print response.
		echo "<pre>$result</pre>";
	}else {
		echo "Archivo no leido\n";
	}
?>