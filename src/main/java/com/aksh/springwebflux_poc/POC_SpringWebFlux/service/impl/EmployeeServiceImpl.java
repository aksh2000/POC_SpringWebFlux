package com.aksh.springwebflux_poc.POC_SpringWebFlux.service.impl;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.repository.EmployeeRepository;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.service.EmployeeService;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.helpers.BeanMapper;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.CreateEmployeeRequest;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.UpdateEmployeeRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Mono<Boolean> createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        employeeRepository.save(BeanMapper.map(createEmployeeRequest, Employee.class)).subscribe();
        return Mono.just(true);
    }

    @Override
    public Mono<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Flux<Employee> getEmployeeDetailsByName(String name) {
        return employeeRepository.findByName(name).subscribeOn(Schedulers.elastic());
    }

    @Override
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Mono<Boolean> updateEmployee(UpdateEmployeeRequest updateEmployeeRequest) {
        employeeRepository.save(BeanMapper.map(updateEmployeeRequest, Employee.class)).subscribe();
        return Mono.just(Boolean.TRUE);
    }

    @Override
    public Mono<Boolean> deleteEmployee(String id) {
        employeeRepository.deleteById(id);
        return Mono.just(Boolean.TRUE);
    }

}
