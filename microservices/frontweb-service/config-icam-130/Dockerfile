#FROM ibmjava:8
#WORKDIR dc_dir
#COPY j2se_datacollector.tgz dc_dir
#RUN ls -l
#RUN ls dc_dir -l
#RUN tar -xf dc_dir/j2se_datacollector.tgz
#COPY /silent_config_j2se_dc.txt dc_dir/bin/
#COPY app.jar /opt/
#RUN dc_dir/bin/config_dc.sh -silent
#RUN chmod +x dc_dir/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh
#RUN mkdir /opt/logs
#
#ENTRYPOINT [ "sh", "-c", "dc_dir/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh" ]
#

# FROM ibmjava:8
# WORKDIR /opt/j2se_dc
# COPY /j2se_datacollector.tgz /opt/j2se_dc
# RUN tar -xf /opt/j2se_dc/j2se_datacollector.tgz
# COPY /silent_config_j2se_dc.txt /opt/j2se_dc/bin/
# COPY app.jar /opt
# RUN /opt/j2se_dc/bin/config_dc.sh -silent
# RUN chmod +x /opt/j2se_dc/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh
# RUN mkdir /opt/logs
# RUN mkdir /opt/j2se_dc/logs
# RUN chmod 777 /opt/logs
# RUN chmod 777 /opt/j2se_dc/logs

# ENTRYPOINT [ "sh", "-c", "/opt/j2se_dc/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh" ]



FROM ibmjava:8
WORKDIR /opt/j2se_dc
COPY /j2se_datacollector.tgz /opt/j2se_dc
RUN tar -xf /opt/j2se_dc/j2se_datacollector.tgz
COPY /silent_config_j2se_dc.txt /opt/j2se_dc/bin/
COPY app.jar /opt/
COPY /ibm-cloud-apm-dc-configpack/global.environment /opt/j2se_dc/itcamdc/etc/
COPY /ibm-cloud-apm-dc-configpack/keyfiles/keyfile.jks /opt/j2se_dc/itcamdc/etc/
RUN /opt/j2se_dc/bin/config_dc.sh -silent
RUN chmod +x /opt/j2se_dc/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh
RUN mkdir -p /opt/logs
RUN mkdir /opt/j2se_dc/logs
RUN mkdir /opt/j2se_dc/logs/CYN
RUN mkdir /opt/j2se_dc/logs/CYN/logs
RUN mkdir /opt/j2se_dc/logs/CYN/logs/localhost.j2seApp

COPY /cynlogging.properties /opt/j2se_dc/toolkit/etc/

RUN chmod 777 /opt/logs 
RUN chmod 777 /opt/j2se_dc/logs
RUN chmod 777 /opt/j2se_dc/logs/CYN
RUN chmod 777 /opt/j2se_dc/logs/CYN/logs
RUN chmod 777 /opt/j2se_dc/logs/CYN/logs/localhost.j2seApp

ENTRYPOINT [ "sh", "-c", "/opt/j2se_dc/runtime/j2sej2seApp.localhost.j2seApp/dcstartup.sh" ]