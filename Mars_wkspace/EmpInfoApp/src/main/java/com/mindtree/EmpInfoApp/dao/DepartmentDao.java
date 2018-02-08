package com.mindtree.EmpInfoApp.dao;

import java.util.Set;

import com.mindtree.EmpInfoApp.entity.Department;
import com.mindtree.EmpInfoApp.entity.Employee;

public interface DepartmentDao {
	
	public void creatDepartment(Department dept);
	public void addEmployToDepartment(Employee emp, Department dept) ;
	public void removeEmployeeFromDepartment(Employee emp,Department dept);
	public Set<Employee> getEmployees();

}
