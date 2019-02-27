package com.example.restapi.controllers;

import javax.jws.HandlerChain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entities.Employee;
import com.example.restapi.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/getallemp")
	//@ResponseBody   //JavaObject into JSON OBject
	public Iterable<Employee> getAllEmp()
	{
	    return empservice.getAllEmp();	
		
	}
	
	@GetMapping("/getemp/{eid}")
	//public Employee getEmp(@RequestParam int eid)
	public Employee getEmp(@PathVariable int eid)
	
	{
	    return empservice.getEmp(eid);	
		
	}
	
	@PostMapping("/createemp")
	//@ResponseBody   // JSON OBject into JavaObject
	public Employee createEmp(@RequestBody Employee emp)
	
	{
	    return empservice.createEmp(emp);	
		
	}
	
	@DeleteMapping("/deleteemp/{eid}")
	//@ResponseBody   // JSON OBject into JavaObject
	public void deleteEmp(@PathVariable int eid)
	
	{
	   empservice.delEmp(eid);	
		
	}
	
	@PutMapping("/updateemp")
	public Employee updateEmp(@RequestBody Employee emp)
	
	{
	    return empservice.updateEmp(emp);	
		
	}
	
	@PatchMapping("/patchemp/{eid}/{salary}")
	public Employee updateEmp(@PathVariable int eid,@PathVariable double salary)
	{
	    return empservice.patchEmp(eid,salary);	
		
	}
	
	
	
	
	
}
