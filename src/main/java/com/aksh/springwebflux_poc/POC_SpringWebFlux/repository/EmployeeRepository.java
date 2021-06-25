package com.aksh.springwebflux_poc.POC_SpringWebFlux.repository;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}
