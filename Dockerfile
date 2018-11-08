FROM openjdk:8-jdk-alpine
LABEL maintainer="jamescollerton@live.co.uk"
VOLUME /tmp
ADD /target/artserviceeurekaserver*.jar artserviceeurekaserver.jar
CMD java -jar artserviceeurekaserver.jar