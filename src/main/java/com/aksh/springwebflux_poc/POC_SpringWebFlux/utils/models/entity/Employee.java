package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
@Builder
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}
