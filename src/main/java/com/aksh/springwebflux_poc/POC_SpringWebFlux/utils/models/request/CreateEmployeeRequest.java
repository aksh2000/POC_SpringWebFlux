package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEmployeeRequest {
    private String name;
    private String email;
}
