package no.frodo.sba;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SBAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBAApplication.class, args);
	}

}
