package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmployeeRequest {
    private String name;
    private String email;
}
