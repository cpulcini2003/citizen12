# Accelerator Log

## Options
```json
{
  "artifactId" : "citizen-test-12",
  "bsGitBranch" : "main",
  "bsGitRepository" : "github.com?owner=cpulcini2003&repo=citizen12",
  "postgresDbName" : "citizen",
  "projectName" : "citizen-12",
  "usePostgresCheckbox" : true
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ engine.transformations[0].validated.delegate (Chain)
┃ ┃ ┃  Info Running Chain(Combo, Combo)
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0] (Combo)
┃ ┃ ┃ ┗  Info Condition (!#usePostgresCheckbox) evaluated to false
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1] (Combo)
┃ ┃ ┃ ┃  Info Condition (#usePostgresCheckbox) evaluated to true
┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[0].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [README-DEPLOY.md]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md matched [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README-DEPLOY.md]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md matched [README-DEPLOY.md] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [README-DEPLOY.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [dbType->Tanzu SQL Postgres S...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[1].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [DBNAME->citizen]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [src/main/resources/application.properties]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [src/main/resources/application.properties] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [src/main/resources/application.properties] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [##DB_PARAMS->spring.jpa.hibernate...(truncated)]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[3].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[3].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗  Info Will replace regex '(?<startOfDependencies><dependencies>)(?<existingDependencies>(?![\s\S]+<groupId>org.postgresql</groupId>\s*<artifactId>postgresql</artifactId>[\s\S]+</dependencies>))' with '${startOfDependencie...(truncated)'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText, ReplaceText, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [config/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will replace [##BINDING_OPTION->serviceClaims:
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info    - ...(truncated)]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [DBNAME->citizen]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[3] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [ARTIFACTID->citizen-test-12]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(InvokeFragment, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#bsGitRepository != null) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0].validated.delegate (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol repoUrl with value 'https://github.com?owner=cpulcini2003&repo=citizen12'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0].validated.delegate.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(OpenRewriteRecipe, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0].validated.delegate.in.transformations[0] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[0].validated.delegate.in.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace regex '(?<beforeBranch>[\s\S]+)(?<branch>branch: [\S]+)(?<rest>[\S\s]*)' with '${beforeBranch}branc...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[0].sources[1].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[4].delegate.transformations[4].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ Debug Multiple representations for path 'config/workload.yaml', will use the one appearing first 
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[5] (Combo)
┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[5].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[5].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/postgresClaimCreate.sh]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug AWS-SETUP.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README-DEPLOY.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-AWS.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TAPSANDBOX.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SETUP-TKGs.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug SPRING-DEMO.md didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-full.yaml didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug commands.sh didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresClaimCreate.sh matched [config/postgresClaimCreate.sh] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/postgres.yaml didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/postgresInfo/usefull_command.txt didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/Citizen.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenApplication.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenController.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenRepository.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/citizen/CitizenService.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/citizen/CitizenApplicationTests.java didn't match [config/postgresClaimCreate.sh] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[0].sources[5].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [DBNAME->citizen]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[1].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/postgresClaimCreate.sh', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/application.properties', will use the one appearing last 
┃ ┗ ┗ ┗ ┗ Debug Multiple representations for path 'config/workload.yaml', will use the one appearing last 
┗ ╺ engine.transformations[1] (UniquePath)
```
