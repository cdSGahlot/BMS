package com.cognizant.BankManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDatastoreRepositories
public class ApplyLoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplyLoanServiceApplication.class, args);
	}

}
