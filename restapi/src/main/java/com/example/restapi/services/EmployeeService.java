package com.example.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.dao.EmployeeDao;
import com.example.restapi.entities.Employee;
@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empdao;
	public Iterable<Employee> getAllEmp()
	{
		return empdao.findAll();
		
	}
	public Employee getEmp(int eid) {
		
		return empdao.findOne(eid);
	}
	public Employee createEmp(Employee emp) {
		// TODO Auto-generated method stub
		return  empdao.save(emp);
	}
	public void delEmp(int eid) {
		
		empdao.delete(eid);
		
	}
	public Employee updateEmp(Employee emp) {
	Employee e=empdao.findOne(emp.getEid());
	e.setEname(emp.getEname());
	e.setSalary(emp.getSalary());
	e.setAddress(emp.getAddress());
		return empdao.save(e);
	}
	public Employee patchEmp(int eid, double salary) {
		Employee e=empdao.findOne(eid);
		e.setSalary(salary);
			return empdao.save(e);
	}
	
}
