package com.cognizant.BankManagementSystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class ApplyLoanConfig extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {
		// TODO Auto-generated method stub
		return "couchbase://127.0.0.1";
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "loginUser";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "password";
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return "loanApplications";
	}

}
