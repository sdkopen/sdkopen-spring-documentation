<img src="https://github.com/SeniorityMeter/spring-sm-starter-bom/assets/36059306/ebfcb364-caea-48eb-972a-2d1ae63f4cdb" alt="logo" width="100"/>

# Seniority Meter
## Spring Documentation

### Description
This is a simple documentation SDK for Spring Boot applications. It provides a simple configuration of provides documentation for your applications. 

___

### How to use
#### 1. Add the following parent to your `pom.xml` file:

```xml
<parent>
    <groupId>br.com.senioritymeter</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.1</version>
</parent>
```
___

#### 2. add scanBasePackages to your SpringBootApplication
```java
@SpringBootApplication(scanBasePackages = {"br.com.senioritymeter", "your.package.name.here"})
```
___
#### 3. Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>br.com.senioritymeter</groupId>
        <artifactId>documentation</artifactId>
        <version>1.0.1</version>
    </dependency>
</dependencies>
```
___

#### 4. Add the following properties to your `application.yaml` file:

```yaml
spring:
  documentation:
    contact:
      name: ${DOCUMENTATION_CONTACT_NAME}
      email: ${DOCUMENTATION_CONTACT_EMAIL}
    info:
      title: ${DOCUMENTATION_INFO_TITLE}
      description: ${DOCUMENTATION_INFO_DESCRIPTION}
      version: ${DOCUMENTATION_INFO_VERSION}
      termsOfService: ${DOCUMENTATION_INFO_TERMS_OF_SERVICE}
    license:
      name: ${DOCUMENTATION_LICENSE_NAME}
      url: ${DOCUMENTATION_LICENSE_URL}
```

___

#### 5. Access the following URL to see the documentation:

```
${HOST_URL}/swagger-ui/index.html
```

