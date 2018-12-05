#!/bin/bash

echo ""
echo ""
echo "###############################################################################" 
echo "############ Estableciendo permisos owner a Metis-WebReports.priv #############" 
echo "###############################################################################" 
echo "####################################Éo=&I*?I±©#################################" 
echo "##################################ë&&I%oI&&I=*?Ñ###############################" 
echo "#################################±I&X£±X±£%*=&*%ë##############################" 
echo "################################Ño%X£ë@±ëX£%££&*o¶#############################" 
echo "################################XoX±£@X£Xo±XXXoIoæ#############################" 
echo "################################§&XëÑÑÑ±£o%%&£±oI##############################" 
echo "#################################@&±Ñ§ÑÑ£oo±ë@Ñ£N##############################" 
echo "##################################N@o£X£&%o£££É################################" 
echo "######################################æë£ë§N###################################" 
echo "###############################################################################" 
echo ""
chmod 600 ../../Metis-WebReports.priv

echo ""
echo ""
echo "###############################################################################" 
echo "############################### Moviendo evidencias ###########################" 
echo "###############################################################################" 
echo "####################################Éo=&I*?I±©#################################" 
echo "##################################ë&&I%oI&&I=*?Ñ###############################" 
echo "#################################±I&X£±X±£%*=&*%ë##############################" 
echo "################################Ño%X£ë@±ëX£%££&*o¶#############################" 
echo "################################XoX±£@X£Xo±XXXoIoæ#############################" 
echo "################################§&XëÑÑÑ±£o%%&£±oI##############################" 
echo "#################################@&±Ñ§ÑÑ£oo±ë@Ñ£N##############################" 
echo "##################################N@o£X£&%o£££É################################" 
echo "######################################æë£ë§N###################################" 
echo "###############################################################################" 
echo ""
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mkdir -p /var/www/metis/atdd/5'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/5/*'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mv /var/www/metis/atdd/4/ /var/www/metis/atdd/5/'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mkdir -p /var/www/metis/atdd/4'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/4/*'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mv /var/www/metis/atdd/3/ /var/www/metis/atdd/4/'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mkdir -p /var/www/metis/atdd/3'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/3/*'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mv /var/www/metis/atdd/2/ /var/www/metis/atdd/3/'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mkdir -p /var/www/metis/atdd/2'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/2/*'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mv /var/www/metis/atdd/1/ /var/www/metis/atdd/2/'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'mkdir -p /var/www/metis/atdd/1'
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'rm -rf /var/www/metis/atdd/1/*'


echo ""
echo ""
echo "###############################################################################" 
echo "########################## Publicando nuevas evidencias #######################" 
echo "###############################################################################" 
echo "####################################Éo=&I*?I±©#################################" 
echo "##################################ë&&I%oI&&I=*?Ñ###############################" 
echo "#################################±I&X£±X±£%*=&*%ë##############################" 
echo "################################Ño%X£ë@±ëX£%££&*o¶#############################" 
echo "################################XoX±£@X£Xo±XXXoIoæ#############################" 
echo "################################§&XëÑÑÑ±£o%%&£±oI##############################" 
echo "#################################@&±Ñ§ÑÑ£oo±ë@Ñ£N##############################" 
echo "##################################N@o£X£&%o£££É################################" 
echo "######################################æë£ë§N###################################" 
echo "###############################################################################" 
echo ""
echo "put -r metis/automatizacion_base/target/site/serenity/* /var/www/metis/atdd/1/" | sftp -i ../../Metis-WebReports.priv metis@190.248.48.5

echo ""
echo ""
echo "###############################################################################" 
echo "########### Formateando archivos de las nuevas evidencias (UTF-8) #############" 
echo "###############################################################################" 
echo "####################################Éo=&I*?I±©#################################" 
echo "##################################ë&&I%oI&&I=*?Ñ###############################" 
echo "#################################±I&X£±X±£%*=&*%ë##############################" 
echo "################################Ño%X£ë@±ëX£%££&*o¶#############################" 
echo "################################XoX±£@X£Xo±XXXoIoæ#############################" 
echo "################################§&XëÑÑÑ±£o%%&£±oI##############################" 
echo "#################################@&±Ñ§ÑÑ£oo±ë@Ñ£N##############################" 
echo "##################################N@o£X£&%o£££É################################" 
echo "######################################æë£ë§N###################################" 
echo "###############################################################################" 
echo ""
ssh -i ../../Metis-WebReports.priv metis@190.248.48.5 'convmv -r -f cp1252 -t utf-8 /var/www/metis/atdd/* --notest > /dev/null'
