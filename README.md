<img src="https://github.com/user-attachments/assets/801ecb0c-455c-41a8-bb52-15d4318f2e78" alt="logo" width="100" style="border-radius: 50%;" />

# SDK Open
## Spring Documentation

### Description
This is a simple documentation SDK for Spring Boot applications.

___

### How to use
#### 1. Add the following parent to your `pom.xml` file:

```xml
<parent>
    <groupId>br.com.sdkopen</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
</parent>
```
___

#### 2. add scanBasePackages to your SpringBootApplication
```java
@SpringBootApplication(scanBasePackages = {"br.com.sdkopen", "your.package.name.here"})
```
___
#### 3. Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>br.com.sdkopen</groupId>
        <artifactId>documentation</artifactId>
        <version>1.0.0</version>
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

