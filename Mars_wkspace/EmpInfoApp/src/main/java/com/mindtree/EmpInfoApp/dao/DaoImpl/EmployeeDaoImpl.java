package com.mindtree.EmpInfoApp.dao.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mindtree.EmpInfoApp.dao.EmployeeDao;
import com.mindtree.EmpInfoApp.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();


	public int addEmployee(Employee employee) {
			
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		
		return 0;
	}

	public void deleteEmployee(int employeeNo) {
		
		   Employee employee ;
		   Session session =  sessionfactory.openSession();
		   employee = (Employee)session.load(Employee.class,employeeNo);
		   session.beginTransaction();
		   session.delete(employee);
           session.getTransaction().commit();
		   session.close();
		
	}

	public void updateEmployee(Employee employee) {
		
		 Session session =  sessionfactory.openSession();
		Employee e = (Employee)session.load(Employee.class,employee.getEmployeeNo());
		session.beginTransaction();
		e.setDateOfBirth(null);
		e.setEmail("shivams359@gmail.com");
		e.setEmployeeName("shivam");
		e.setSalary(20000);
		session.getTransaction().commit();
		session.close();
		
	}

	public Employee getEmployee(int employeeNo) {
		
		 Employee employee ;
		  Session session =  sessionfactory.openSession();
		  session.beginTransaction();
		  employee = (Employee)session.load(Employee.class,employeeNo);
		  System.out.println(employee.getEmployeeNo());
		  System.out.println(employee.getEmployeeName());
		  System.out.println(employee.getEmail());
		  System.out.println(employee.getDateOfBirth());
		  System.out.println(employee.getSalary());
		  session.getTransaction().commit();
		  session.close();
		  
		return employee;
	}

}
