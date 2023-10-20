# Introduction citizen-service API

citizen-service provides you a basic sample application setup to implement your business logic. It is based on the commonly known 3-layered application architecture in where the class `CitizenController` provides the presentation layer, the `CitizenService` provides the services and business domain and finally the `CitizenRepository` provides you the capability to persist your domain.

It is leveraging Spring Boot as a technology stack, which provides:
- a stating point to implement a REST(ful) API using Spring Web annotations
- data persistence using Spring Data JPA (now PostgreSQL is supported, but other databases can be easily added)

The TAP accelerator will allow to customize configuration files in order to use an H2 in memory database created automatically at run or a PostgreSQL database that needs to be instantiated in your k8s cluster and passed as parameter to the TAP Accelerator 


## Prerequisites

In order to further develop this application the following tools needs to be setup:
- Java Development Kit (https://bell-sw.com/)
- Visual Studio Code or IntelliJ IDEA as Integrated Development Environment (IDE)


## Selected configurations

Here are some configurable customized by accelerator:

Database Type
* Tanzu SQL Postgres ServiceClaim

Configuration files were updated accordingly see:
- src/main/resources/application.properties
- pom.xml


# Configuring a database

## In-memory with H2

An in-memory Database instance will be deploye at application run. This database will be dropped as soon as the application exits or cleaned if restared 

## Using PostgreSQL as the database with Tanzu Application Platform (TAP)

Using the `config/workload.yaml` it is possible to build, test and deploy this application onto a
Kubernetes cluster that is provisioned with Tanzu Application Platform (https://tanzu.vmware.com/application-platform).

As with the local deployment a PostgreSQL instance needs to be available at the cluster.

1. App Operator Tasks

   - Create the service `ClassClaim` to be consumed by your workload that references your PostgreSQL instance:

      ```bash
      $ tanzu service class-claim create citizen --class postgresql-unmanaged -n <workload-namespace>
      ```

2. App Developer Tasks

   Now that we have the database instance and class claim configured, we can check the database state by running:
   
   ```bash
   tanzu services class-claims get citizen -n <workload-namespace>
   ```

   Make sure the claim status is "Ready".
   
   As soon as the database claim is ready, the `Workload` can be deployed.