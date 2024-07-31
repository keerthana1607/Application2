package com.keerthana.demo.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.model.Employee;
import com.keerthana.demo.model.LeaveRequest;

@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	EmployeeServiceImpl emp;

	@Test
	void testGetAllEmployee() {
		assertNotNull(emp.getAllEmployee());
	}

//	@Test
//	void testDeleteEmployee() {
//		assertEquals("deleted", emp.deleteEmployee(6));
//	}

//	@Test
//	void testDeleteEmployee() {
//		assertEquals("failed", emp.deleteEmployee(6));
//	}

	
//	@Test
//	void testAddEmployee() {	
//		Employee employee=new Employee(0, "praba", "soolakara", null);
//		assertEquals("Success", emp.addEmployee(employee, 3));	
//	}
	
	
//	@Test
//	void testAddEmployee() {
//		Employee employee=null;
//		assertEquals("Fail to Add", emp.addEmployee(employee, 3));	
//	}
	

//	@Test
//	void testUpdateEmployee() {
//		Employee empl =new Employee(6, "praba", "thirunelveli",null);
//		assertEquals("Success",emp.updateEmployee(empl,6));
//	}
	
//	@Test
//	void testUpdateEmployee() {
//		Employee empl =new Employee(67, "praba", "thirunelveli",null);
//		assertEquals("Fail to Update",emp.updateEmployee(empl,67));
//	}
	

//	@Test
//	void testGetEmployee() {
//		assertNotNull(emp.getEmployee(6));
//	}

//	@Test
//	void testGetEmployee() {
//		assertNull(emp.getEmployee(68));
//	}

	
}
