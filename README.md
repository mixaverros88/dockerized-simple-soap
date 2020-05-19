[![Build Status](https://travis-ci.com/mixaverros88/simple-soap.svg?branch=master)](https://travis-ci.com/mixaverros88/simple-soap)
![preview image](https://img.shields.io/github/followers/mixaverros88?label=Follow&style=plastic)
![preview image](https://img.shields.io/github/forks/mixaverros88/simple-soap?style=plastic)
![preview image](https://img.shields.io/github/stars/mixaverros88/simple-soap?style=plastic)
![preview image](https://img.shields.io/github/watchers/mixaverros88/simple-soap?style=plastic)
[![Known Vulnerabilities](https://snyk.io/test/github/mixaverros88/simple-soap/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/mixaverros88/simple-soap?targetFile=pom.xml)

## Docker Instructions ##
![preview image](https://github.com/mixaverros88/simple-soap/blob/master/icons/dockerIcon.png) In order to spin up the docker container run the following command
````
docker run -p 8080:8080 --name=simpleSoap  mixaverross88/java-simple-soap:1.0
````

### :computer: Deploy instructions ###
Use the maven plug-in (tomcat7-maven-plugin) for tomcat server in order to automatically deploy this project in your local server. You can find this plug-in in pom.xml file in order to modify with yours configurations, also don't forget to add in settings.xml your credentials for tomcat server.
```
<servers>
    <server>
        <id>TomcatServer</id>
        <username>admin</username>
        <password>password</password>
    </server>
</servers>
```
You can run the below command in order to deploy the artifact in your local tomcat server
```
mvn clean tomcat7:deploy
```
In tomcat-user.xml don't forget to add the below user
```
<role rolename="admin"/>
<role rolename="manager-script"/>
<role rolename="manager-jmx"/>
<user username="admin" password="password" roles="manager-gui,admin,manager-jmx,manager-script"/>
```

After the deploy visit the following url in order to get the WSDL file
```
http://localhost:8080/sumws/services/sumService?wsdl
```
