package com.keerthana.demo.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.model.LeaveRequest;
import com.keerthana.demo.service.LeaveRequestService;

@SpringBootTest
class LeaveRequestServiceImplTests {
	
	@Autowired
	private LeaveRequestServiceImpl ser;
	

//	@Test
//	void testAddLeaveRequest() {
//		LeaveRequest leave =new LeaveRequest(0,"summa","fever");
//		assertEquals("success",ser.addLeaveRequest(leave));
//	}
//	@Test
//	void testAddLeaveRequest1() {
//		LeaveRequest leave =null;
//		assertEquals("fail to Add",ser.addLeaveRequest(leave));
//	}
	
//	@Test
//	void testUpdateLeaveRequest1() {
//		LeaveRequest leave =new LeaveRequest(5,"casual leave","summa");
//		assertEquals("updated",ser.updateLeave(leave));
//	}
//	

	@Test
	void testGetAllLeaveRequest1() {
		assertNotNull(ser.getAllLeave());
	}
//	@Test
//	void testGetIdLeaveRequest1() {
//		assertNotNull(ser.getLeave(5));
//	}
	

	
}
