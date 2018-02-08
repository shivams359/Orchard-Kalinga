package com.mindtree.EmpInfoApp.dao;

import com.mindtree.EmpInfoApp.entity.Employee;

public interface EmployeeDao {
	
	public  int addEmployee(Employee employee);
	public void deleteEmployee(int employeeNo);
	public void updateEmployee(Employee employee);
	public Employee getEmployee(int employeeNo);

}
