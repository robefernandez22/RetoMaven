# RetoMaven
Reto Maven
  Este proyecto tiene un proyecto padre, el cual es el siguiente:
    org.springframework.boot:spring-boot-starter-parent:1.4.2.RELEASE
 
  Este proyecto también tiene las siguientes properties (todas ellas explicadas mediante comentarios en el pom.xml):
    project.build.sourceEncoding: UTF-8
    project.reporting.outputEncoding: UTF-8
    java.versión: 1.8
    
  Este proyecto tiene las siguientes dependencias (todas ellas explicadas mediante comentarios en el pom.xml):
    org.springframework.boot:spring-boot-starter-data-jpa
    org.springframework.boot:spring-boot-starter-web
    org.hsqldb:hsqldb (con el scope runtime)
    mysql:mysql-connector-java (con el scope runtime)
    org.springframework.boot:spring-boot-starter (con el scope test)
 
  Este proyecto tiene el siguiente plugin (explicado mediante un comentario en el pom.xml):
    org.springframework.boot:spring-boot-maven-plugin
   
  Y por último, este proyecto tiene los siguientes plugins de reporting (Todos ellos comentados en el pom.xml):
    org.apache.maven.plugins:maven-project-info-reports-plugin:2.7 (con dependencyLocationsEnabled=false)
    org.apache.maven.plugins:maven-surefire-report-plugin:2.19.1
    org.codehaus.mojo:cobertura-maven-plugin:2.7 (con format=html)

En total, son 3 properties, 5 dependencias y 4 plugins.
Para generar la documentación del proyecto ha sido necesario ubicarme a la altura del pom.xml de mi proyecto y ejecutar el comando mvn:site,
esto también ha generado la documentación referente a Surefire(disponible en RetoMaven/target/site/surefire-report.html) 
y a Cobertura(disponible en RetoMaven/target/site/cobertura/index.html).
