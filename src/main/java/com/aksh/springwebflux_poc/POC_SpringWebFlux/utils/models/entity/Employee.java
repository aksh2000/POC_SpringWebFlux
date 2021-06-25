package com.aksh.springwebflux_poc.POC_SpringWebFlux.utils.models.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "employee")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Employee Details {id=" + id + ", name=" + name + ", email=" + email + "}";
    }
}
