package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetailsResponse {
    private String id;
    private String name;
    private String email;
}
