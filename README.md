A checklist implemented by Spring-boot and AngularJS
---
## install Angular JS

#### install bower
npm install -g bower

### install dependencies
bower install

### MySQL
Want to write Chinese Character, and you should make sure database character set is UTF-8.
```
show variables like "%char%";
```

##  run
mvn spring-boot:run
or
run MyApplication.main
