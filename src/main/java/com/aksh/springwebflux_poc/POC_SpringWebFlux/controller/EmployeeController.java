package com.aksh.springwebflux_poc.POC_SpringWebFlux.controller;

import com.aksh.springwebflux_poc.POC_SpringWebFlux.service.EmployeeService;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.constants.ApiPath;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity.Employee;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.CreateEmployeeRequest;
import com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request.UpdateEmployeeRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping(ApiPath.BASE_URL)
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(ApiPath.EMPLOYEE)
    Mono<Boolean> createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        return employeeService.createEmployee(createEmployeeRequest);
    }

    @GetMapping(ApiPath.EMPLOYEE + ApiPath.EMPLOYEE_ID)
    Mono<Employee> getEmployeeById(@PathVariable("id") String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(value = ApiPath.EMPLOYEE + ApiPath.NAME + ApiPath.EMPLOYEE_NAME, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Employee> getEmployeesByName(@PathVariable("name") String name) {
        return employeeService.getEmployeeDetailsByName(name);
    }

    @PutMapping(ApiPath.EMPLOYEE)
    Mono<Boolean> updateEmployeeDetails(@RequestBody UpdateEmployeeRequest updateEmployeeRequest) {
        return employeeService.updateEmployee(updateEmployeeRequest);
    }

    @DeleteMapping(ApiPath.EMPLOYEE + ApiPath.EMPLOYEE_ID)
    Mono<Boolean> deleteEmployee(@PathVariable("id") String id) {
        return employeeService.deleteEmployee(id);
    }

    @PostMapping(ApiPath.DUMP_SAVE)
    void dumpSaveUsersToDB(){
        for(int i =0; i<100000000; i++){
            employeeService.createEmployee(CreateEmployeeRequest.builder()
            .name("name")
            .email("test@email.com")
            .build());
        }
    } 
}
