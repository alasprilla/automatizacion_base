#!/bin/bash

chmod 600 ../../Metis-WebReports.priv
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/*'
echo "put -r metis/automatizacion_base/target/site/serenity/* /var/www/metis/atdd/" | sftp -i ../../Metis-WebReports.priv metis@190.248.48.5
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'convmv -r -f cp1252 -t utf-8 /var/www/metis/atdd/* --notest > /dev/null'
