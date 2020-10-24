package org.sid.catservice;

import org.sid.catservice.dao.EmployeeRepository;
import org.sid.catservice.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication  implements CommandLineRunner {
	@Autowired
    private EmployeeRepository produitRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}


	public void run(String... args) throws Exception {

		restConfiguration.exposeIdsFor(Employee.class);

	}
}
