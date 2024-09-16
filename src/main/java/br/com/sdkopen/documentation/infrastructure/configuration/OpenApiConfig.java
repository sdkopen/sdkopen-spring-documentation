package br.com.sdkopen.documentation.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
  @Value("${spring.documentation.contact.name}")
  private String documentationContactName;

  @Value("${spring.documentation.contact.email}")
  private String documentationContactEmail;

  @Value("${spring.documentation.license.name}")
  private String documentationLicenseName;

  @Value("${spring.documentation.license.url}")
  private String documentationLicenseUrl;

  @Value("${spring.documentation.info.title}")
  private String documentationInfoTitle;

  @Value("${spring.documentation.info.description}")
  private String documentationInfoDescription;

  @Value("${spring.documentation.info.version}")
  private String documentationInfoVersion;

  @Value("${spring.documentation.info.termsOfService}")
  private String documentationInfoTermsOfService;

  @Bean
  public OpenAPI myOpenAPI() {
    Contact contact = new Contact();
    contact.setName(documentationContactName);
    contact.setEmail(documentationContactEmail);

    License mitLicense = new License().name(documentationLicenseName).url(documentationLicenseUrl);

    Info info =
        new Info()
            .title(documentationInfoTitle)
            .version(documentationInfoVersion)
            .contact(contact)
            .description(documentationInfoDescription)
            .termsOfService(documentationInfoTermsOfService)
            .license(mitLicense);

    return new OpenAPI().info(info);
  }
}
