# Portfolio Management Project

This is a project contains customer portal to be developed part of this scope that consumes these microservices to view their portfolio information and sell their assets.

The customer portal performs login using jwt authentication and then include a dashboard.

Daily Share Price Module is a middleware microservice to get daily share price of a stock.

Daily Mutual Fund NAV Module is a middleware microservice that gets NAV value of a mutual fund.

Calculate Net worth Module is a microservice that calculates the current value of share holdings and mutual fund holdings and find out the total net-worth and then sell
assets.

# Technology Used

HTML: Page layout has been designed in HTML.

CSS: CSS has been used for all the designing part.

Java Spring Boot: All the business and backend API logic has been implemented in Java Spring Boot.

Angular: All the frontend logic has been implemented over the Angular and angular CLI is used.

Visual Studio Code : For Angular, we have used Visual Studio Code.

STS: We have used STS (Spring Tool Suite) for developing all spring boot API's.

Tomcat: Project will be run over the Tomcat server

# Modules
For each module, we have a controller class, exception class, model class, repository and service class. 

The controller class is responsible for processing incoming REST API requests, preparing a model, and returning the view to be rendered as a response. The repository provides the mechanism for storage, retrieval, search, update and delete operation on objects as required by the module. The model class works a container that contains the data of the application. For example, we have Stock Model class where there are values stockId, stockName and stockValue. The service class is used by a client to interact with some functionality in the particular module. 

In each module, we have used FeignClient to authorize the user. 

The data.sql file under the resources section defines the required sql queries in a particular module. We have included a few predefined stocks and mutual values. We also have a list of users. 

The customer-portal module contains code in Angular.



