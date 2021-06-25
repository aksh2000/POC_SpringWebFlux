package com.aksh.springwebflux_poc.POC_SpringWebFlux.service;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.CreateEmployeeRequest;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.UpdateEmployeeRequest;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.response.EmployeeDetailsResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {
    Mono<Boolean> createEmployee(CreateEmployeeRequest createEmployeeRequest);

    Mono<Employee> getEmployeeById(String id);

    Flux<Employee> getEmployeeDetailsByName(String name);

    Flux<Employee> getAllEmployees();

    Mono<Boolean> updateEmployee(UpdateEmployeeRequest updateEmployeeRequest);

    Mono<Boolean> deleteEmployee(String id);
}
