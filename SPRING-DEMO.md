## RUN INTRO TO NEW SPRING RELEASE


## CREATE A SPRING RESTFUL API

https://start.spring.io/

### 1 - creazioen di un microservizio basato su spring 2.7

maven, java 17
Spring Web, Spring Data JPA, H2 Database, Spring Boot Actuator

COMPILE & CHECK START

<java.version>17</java.version>

CHECK LOCAL VERSION
pcarlo@pcarlo3C2T5 demo_27 % java -version
java version "19.0.1" 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
pcarlo@pcarlo3C2T5 demo_27 % 

> ./mvnw -q clean package spring-boot:start -DskipTests

:: Spring Boot ::               (v2.7.16)
2023-10-17 16:17:21.558  INFO 49300 Starting Demo27Application using Java 19.0.1 ....
2023-10-17 16:17:22.143  INFO 49300 StandardService   : Starting service [Tomcat]
2023-10-17 16:17:22.143  INFO 49300 StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.80]
2023-10-17 16:17:22.214  INFO 49300 Initializing Spring embedded WebApplicationContext
2023-10-17 16:17:22.214  INFO 49300 Root WebApplicationContext: initialization completed in 631 ms
2023-10-17 16:17:22.849  INFO 49300 --- Demo27Application: Started Demo27Application in 1.443 seconds (JVM running for 1.721)

> vmmap 49300 | grep Physical
Physical footprint:         215.0M
Physical footprint (peak):  231.0M
pcarlo@pcarlo3C2T5 demo_27 % 

STOP THE PROCESS
> ./mvnw spring-boot:stop -Dspring-boot.stop.fork



### 2 - creazioen di un microservizio basato su spring 3.1  NO_BENEFITS for RAM & START_TIME


<java.version>17</java.version>

 :: Spring Boot ::                (v3.1.4)
2023-10-17T16:30:02.143+02:00  INFO 51348 Starting Demo31Application using Java 19.0.1 ...
2023-10-17T16:30:02.793+02:00  INFO 51348 Starting service [Tomcat]
2023-10-17T16:30:02.793+02:00  INFO 51348 Starting Servlet engine: [Apache Tomcat/10.1.13]
2023-10-17T16:30:02.836+02:00  INFO 51348 Root WebApplicationContext: initialization completed in 669 ms
2023-10-17T16:30:03.609+02:00  INFO 51348 Demo31Application: Started Demo31Application in 1.612 seconds (process running for 1.891)
pcarlo@pcarlo3C2T5 demo_31 % vmmap 51348 | grep Physical
Physical footprint:         235.1M
Physical footprint (peak):  240.7M


### 3 - creazione di un microservizio basato su spring 3.1  NO_BENEFITS for RAM & START_TIME

INSTALL SDKMAN
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"

INSTALL CANDIDATE
sdk install java 17.0.8-graalce

### SELECT CANDIDATE
pcarlo@pcarlo3C2T5 demo_31 % sdk use java 17.0.8-graalce 
Using java version 17.0.8-graalce in this shell.
pcarlo@pcarlo3C2T5 demo_31 % 

RUN & CHECK PARAMS
2023-10-17T17:16:02.768+02:00  INFO 61409 Started Demo31Application in 1.573 seconds (process running for 2.524)

pcarlo@pcarlo3C2T5 demo_31 % vmmap 61409 | grep Physical
Physical footprint:         204.8M
Physical footprint (peak):  232.3M

#### COMPILE NATIVE

> ./mvnw -Pnative native:compile  -DskipTests

WILL DOWNLOAD LIBs & COMPILE
[4/8] Parsing methods...      [**]                                                                       (4.3s @ 2.62GB)
[5/8] Inlining methods...     [****]                                                                     (1.9s @ 4.03GB)
[6/8] Compiling methods...    [*****]                                                                   (23.6s @ 4.53GB)
[7/8] Layouting methods...    [***]                                                                      (7.8s @ 4.21GB)
[8/8] Creating image...       [****]                                                                    (13.9s @ 3.17GB)
  72.42MB (53.95%) for code area:   108,569 compilation units
  60.30MB (44.92%) for image heap:  630,156 objects and 199 resources
   1.51MB ( 1.12%) for other data
 134.22MB in total

 > ./target/demo_31 &

 :: Spring Boot ::                (v3.1.4)
2023-10-17T17:28:53.665+02:00  INFO 63615 --- [           main] com.example.demo_31.Demo31Application    : Started Demo31Application in 0.14 seconds (process running for 0.166)

pcarlo@pcarlo3C2T5 demo_31 % vmmap 63615 | grep Physical
Physical footprint:         56.8M
Physical footprint (peak):  56.8M
pcarlo@pcarlo3C2T5 demo_31 % 

KILL PROCESS TO CLOSE APP
> kill -9 63615


