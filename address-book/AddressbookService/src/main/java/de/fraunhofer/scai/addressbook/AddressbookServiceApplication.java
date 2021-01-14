package de.fraunhofer.scai.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AddressbookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookServiceApplication.class, args);
	}

}
