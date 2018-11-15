[![Build Status](https://travis-ci.com/JamesCollerton/Art_Service_Eureka_Server.svg?token=KdiR1xs9jsHVYsSCNwx4&branch=master)](https://travis-ci.com/JamesCollerton/Art_Service_Eureka_Server)
[![codecov](https://codecov.io/gh/JamesCollerton/Art_Service_Eureka_Server/branch/master/graph/badge.svg)](https://codecov.io/gh/JamesCollerton/Art_Service_Eureka_Server)
[![Maintainability](https://api.codeclimate.com/v1/badges/265dca807d23c7f1719e/maintainability)](https://codeclimate.com/github/JamesCollerton/Art_Service_Eureka_Server/maintainability)

# Art Service Eureka Server

This is the art service eureka server.

Detail | Value
------------ | -------------
Port Number | 8761
Spring Application Name | 
ECR Repository Name | art-service-eureka-server
ECS Service/ Task Name |

The Eureka Dashboard is available at: http://localhost:8761/.

## What is Eureka?

The microservice style of architecture is not so much about building individual services so much as it is making the interactions between services reliable and failure-tolerant. 

A service registry is a phone book for your microservices. Each service registers itself with the service registry and tells the registry where it lives (host, port, node name) and perhaps other service-specific metadata - things that other services can use to make informed decisions about it. Clients can ask questions about the service topology (“are there any ‘fulfillment-services’ available, and if so, where?”) and service capabilities (“can you handle X, Y, and Z?”).
