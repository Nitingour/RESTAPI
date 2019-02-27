package com.example.restapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.restapi.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
