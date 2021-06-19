package com.seyitucar.hrmsSpring;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import com.seyitucar.hrmsSpring.core.utilities.helpers.mediaUpload.CloudinaryManager;
import com.seyitucar.hrmsSpring.core.utilities.helpers.mediaUpload.CloudinaryService;

@SpringBootApplication
@EnableSwagger2
public class HrmsSpringApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HrmsSpringApplication.class, args);
					
	}
	
	@Bean
	public Cloudinary cloudinary() {
		
		return new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "seyitucar",
				"api_key", "635486353668943",
				"api_secret", "wdo2bXi1zHp75ZYyI6RCZVV81zg"));
	}
	
	@Bean
	public CloudinaryService cloudinaryService() {
		return new CloudinaryManager(cloudinary());
	}
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.seyitucar.hrmsSpring"))                                   
          .build();                                           
    }

}
