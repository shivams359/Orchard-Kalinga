package com.mindtree.employeetable.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeetable.dao.EmployeeDao;
import com.mindtree.employeetable.entities.Employee;
import com.mindtree.employeetable.service.EmployeeService;

@Service("employeeService")
//@Transactional(dontRollbackOn = Propagation.SUPPORTS, dontRollbackOn = true)
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	 private EmployeeDao employeeDao;
	
	//@Transactional(propagation = Propagation.REQUIRED, dontRollbackOn = false)
	 public void addEmployee(Employee employee) {
	  employeeDao.addEmployee(employee);
	 }
	 
	 public List<Employee> listEmployeess() {
	  return employeeDao.listEmployeess();
	 }

	 public Employee getEmployee(int empid) {
	  return employeeDao.getEmployee(empid);
	 }
	 
	 public void deleteEmployee(Employee employee) {
	  employeeDao.deleteEmployee(employee);
	 }
}
