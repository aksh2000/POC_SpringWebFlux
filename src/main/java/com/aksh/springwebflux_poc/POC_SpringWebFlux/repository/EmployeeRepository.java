package com.aksh.springwebflux_poc.POC_SpringWebFlux.repository;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String>{
    
}
