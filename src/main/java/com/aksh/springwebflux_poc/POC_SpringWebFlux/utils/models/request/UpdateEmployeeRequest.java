package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateEmployeeRequest {
    private String id;
    private String name;
    private String email;
}
