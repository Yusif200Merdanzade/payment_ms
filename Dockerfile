FROM ubuntu:20.04
RUN apt-get install -y tzdata
RUN apt-get -y install apache2
RUN apt-get install -y maven
RUN apt-get install -y vim
ADD . /var/payment_ms
RUN cd /var/payment_ms && mvn clean install
EXPOSE 9095
CMD apachectl -D FOREGROUND
