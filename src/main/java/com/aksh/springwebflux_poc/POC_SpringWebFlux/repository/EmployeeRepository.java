package com.aksh.springwebflux_poc.POC_SpringWebFlux.repository;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

// @Query("{ 'name': ?0 }")

    @Tailable
    Flux<Employee> findByName(final String name);
}
