scp -r -i ..\\..\\Metis-WebReports.ppk "automatizacion_base\target\site\serenity\*" metis@190.248.48.5:/var/www/metis/atdd/
curl http://190.248.48.5/metis/command.php?rename