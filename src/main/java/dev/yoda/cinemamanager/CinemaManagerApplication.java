package dev.yoda.cinemamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @EnableAutoConfiguration
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// @EnableJpaRepositories(basePackages = "dev.yoda.cinemamanager.repository")
@SpringBootApplication
public class CinemaManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaManagerApplication.class, args);
	}

}
