<?php
	error_reporting(E_ERROR | E_PARSE);
	# Discriminacion de lectura de parametro segun sea cliente o web
	if (PHP_SAPI === 'cli') {
		echo "Esta usando un cliente <br>\n";
		$fileName = $argv[1];
		$title = $argv[2];
	} else {
		echo "Está usando un navegador Web <br>\n";
		$fileName=$_GET['parametro'];
		$title=$_GET['title'];
	}
	if (empty($title)) {
		$title = $fileName;
	}
	echo "parametro=$fileName <br>\n";
	echo "title=$title <br>\n";
	$archivo1=$fileName;
	$lectura = fopen($archivo1, "r");
	$i=1;
	$requestBody=array();
	$requestFields=array();

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
				$Inestables=$Errors+$Failures;
				$color="#36a64f";
				if((($Error/$Test)>0.15)||((($Failures/$Test)>0.15))||((($Inestables/$Test)>0.15))){
					$color="#ff0000";
				}elseif((($Error/$Test)>0.05)||((($Failures/$Test)>0.05))||((($Inestables/$Test)>0.05))){
					$color="#e08114";
				}
				
				print(" <br>\n");
				print("_____________________ <br>\n");
				print("Test: $Test <br>\n");
				print("Error: $Errors <br>\n");
				print("Failures: $Failures <br>\n");
				print("Inestables: $Inestables <br>\n");
				print("color: $color <br>\n");
				
				$requestBody['text']=$linea;
				$requestBody['pretext']=$title;
				$requestBody['color']=$color;
				
				$requestField=array();
				$requestField['title']='Resumen';
				$requestField['value']=$text;
				$requestField['short']='false';
				array_push($requestFields, $requestField);	
			}
			$i++; 
		}
		fclose($lectura);
		$requestBody['fields']=$requestFields;
		$data_string=json_encode($requestBody);
		$resp2=array();
		$data_string= '{"attachments":[' . json_encode($requestBody) . ']}';
		
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