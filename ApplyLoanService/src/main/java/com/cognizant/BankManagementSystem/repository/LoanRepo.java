package com.cognizant.BankManagementSystem.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.BankManagementSystem.model.LoanModel;

@Repository
public interface LoanRepo extends CouchbaseRepository<LoanModel, Integer>{

}
