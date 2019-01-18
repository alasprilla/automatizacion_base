<?php
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
		while(!feof($lectura)){
			$linea =trim(fgets($lectura));
			if((strpos($linea, "Tests run:") !== false) || (strpos($linea, "Tests:") !== false)){
				$resp1['text']=$linea;	
			}
			$i++; 
		}
		print(" <br>\n");
		fclose($lectura);
		$data_string=json_encode($resp1);
		print("Se encontro el siguiente dato: ");
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