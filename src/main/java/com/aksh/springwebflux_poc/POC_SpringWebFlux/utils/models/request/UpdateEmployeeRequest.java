package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEmployeeRequest {
    private String id;
    private String name;
    private String email;
}
