package com.mindtree.employeetable.service;

import java.util.List;

import com.mindtree.employeetable.entities.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	 public List<Employee> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
