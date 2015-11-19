# codequalityuebung

## Plugins:
+ surefire (mvn clean test)
+ failsafe (mvn clean integration-test or mvn clean verify)
+ cobertura (mvn cobertura:cobertura)
+ checkstyle (mvn checkstyle:checkstyle)
+ findbugs (mvn findbugs:findbugs => xml, mvn findbugs:gui => swing GUI)

mvn clean install site => all reports in html

------------------------------------

further information (e.g. integration of the plugins into the pom.xml and goal names) under http://www.mojohaus.org or [](gleclaire.github.io/findbugs-maven-plugin/index.html)
