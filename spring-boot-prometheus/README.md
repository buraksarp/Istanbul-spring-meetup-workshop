Spring Boot Exporter for Prometheus TSDB.
=========================

This demo assumes you know how to run Docker.

Building Containers & prometheus application
---------------------

Nothing special if you already have Docker installed:

    $ git clone https://github.com/buraksarp/istanbul-spring-meetup-workshop.git
    $ cd istanbul-spring-meetup-workshop/prometheus-app
    $ mvn clean package -DskipTests
    $ cd istanbul-spring-meetup-workshop/spring-boot-prometheus
    $ docker-compose build 

Running Containers with the docker-compose
---------------------
To run these containers:

    $ docker-compose up
    
To view Spring Boot Metrics Dashboard on Grafana
---------------------

go to grafana UI: [http://localhost:3000](http://localhost:3000)

Default username & password : admin


    

