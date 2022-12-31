package com.eannonce.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages={"<com.eannonce.app>"})
//@EnableJpaRepositories(basePackages={"<com.eannonce.app.repository>"})
//@EnableTransactionManagement
//@EntityScan(basePackages={"<com.eannonce.app.model>"})
public class EannonceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EannonceApplication.class, args);
	}

}
