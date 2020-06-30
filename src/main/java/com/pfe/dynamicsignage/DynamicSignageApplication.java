package com.pfe.dynamicsignage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// (exclude = {HibernateJpaAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.pfe.dynamicsignage.dao")
public class DynamicSignageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicSignageApplication.class, args);
	}

}
