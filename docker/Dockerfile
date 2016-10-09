FROM java:7-jdk
MAINTAINER mkroli
ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

ENV KARAF_VERSION=3.0.8

RUN wget http://www-us.apache.org/dist/karaf/${KARAF_VERSION}/apache-karaf-${KARAF_VERSION}.tar.gz; \
    mkdir /opt/karaf; \
    tar --strip-components=1 -C /opt/karaf -xzf apache-karaf-${KARAF_VERSION}.tar.gz; \
    rm apache-karaf-${KARAF_VERSION}.tar.gz; \
    mkdir /deploy; \
    sed -i 's/^\(felix\.fileinstall\.dir\s*=\s*\).*$/\1\/deploy/' /opt/karaf/etc/org.apache.felix.fileinstall-deploy.cfg
    
    RUN rm /opt/karaf/etc/org.apache.karaf.features.cfg
    COPY   config/org.apache.karaf.features.cfg  /opt/karaf/etc


VOLUME ["/deploy"]
ADD target /deploy	

EXPOSE 1099 8101 8181 44444
ENTRYPOINT ["/opt/karaf/bin/karaf"]
