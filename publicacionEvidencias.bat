#!/bin/bash

set key="..\\..\\..\\Metis-WebReports.priv"
cmd /c icacls %key% /c /t /inheritance:d
cmd /c icacls %key% /c /t /grant %username%:F
cmd /c icacls %key%  /c /t /remove Administrator BUILTIN\Administrators BUILTIN Everyone System Users
cmd /c icacls %key%

ssh -i ..\\..\\..\\Metis-WebReports.priv metis@190.248.48.5 "rm -rf /var/www/metis/atdd/*"
echo y|pscp -r -i ..\\..\\..\\Metis-WebReports.ppk "metis\automatizacion_base\target\site\serenity\*" metis@190.248.48.5:/var/www/metis/atdd/
ssh -i ..\\..\\..\\Metis-WebReports.priv metis@190.248.48.5 "convmv -r -f cp1252 -t utf-8 /var/www/metis/atdd/* --notest > /dev/null"

