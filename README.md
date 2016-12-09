# Spring Sprint 1

## Spring Framework Experimenting Sprints #1

### Description
Simple Spring application demonstrating two ways of creating the ApplicationContext (AnnotationConfigApplicationContext and ClassPathXmlApplicationContext). Bonus feature, use of logback for logging.

### How to run
Simply run Application.class from your IDE or run: `mvn compile exec:java`

Note: the `exec:java` command assumes as argument `ANNOTATION`. If you want to change this please comment out the following  in `pom.xml`

```
<arguments>
    <argument>ANNOTATION</argument>
</arguments>
```


