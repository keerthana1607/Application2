package com.keerthana.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.keerthana.demo.model.Employee;

//methods declared in service Implementation package
@Service
public interface EmployeeService {

	String addEmployee(Employee emp, int pId);
	public List<Employee> getAllEmployee();
	public String deleteEmployee(int id);
	public String updateEmployee(Employee emp, int eid);
}
