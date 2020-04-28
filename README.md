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