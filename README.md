# codequalityuebung 

Travis CI | Coveralls
--------- | ----------
[![Build Status](https://travis-ci.org/mlevental/codequalityuebung.svg?branch=master)](https://travis-ci.org/mlevental/codequalityuebung) | <a href='https://coveralls.io/github/mlevental/codequalityuebung?branch=master'><img src='https://coveralls.io/repos/mlevental/codequalityuebung/badge.svg?branch=master&service=github' alt='Coverage Status' /></a>

## Plugins:
+ surefire (mvn clean test)
+ failsafe (mvn clean integration-test or mvn clean verify)
+ cobertura (mvn cobertura:cobertura)
+ checkstyle (mvn checkstyle:checkstyle)
+ findbugs (mvn findbugs:findbugs => xml, mvn findbugs:gui => swing GUI)

mvn clean install site => all reports in html

------------------------------------

further information (e.g. integration of the plugins into the pom.xml and goal names) under http://www.mojohaus.org or http://gleclaire.github.io/findbugs-maven-plugin/
