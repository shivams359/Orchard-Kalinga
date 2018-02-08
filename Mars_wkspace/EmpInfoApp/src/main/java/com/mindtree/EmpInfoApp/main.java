package com.mindtree.EmpInfoApp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mindtree.EmpInfoApp.dao.EmployeeDao;
import com.mindtree.EmpInfoApp.dao.DaoImpl.EmployeeDaoImpl;
import com.mindtree.EmpInfoApp.entity.Employee;

public class main {

	public static void main(String[] args)
	{
		int choice,nameid;
		String name,email;
		double salary;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choices Available:");
		System.out.println("1.create");
		System.out.println("2.read");
		System.out.println("3.update");
		System.out.println("4.delete");
		
		System.out.println("enter your choice:");
		choice = scan.nextInt();
		EmployeeDao employeeDao = new EmployeeDaoImpl() ;	
		switch (choice) {
		case 1:
			Employee employee = new Employee();
			employee.setDateOfBirth(null);
			System.out.println("enter your name:");
			name = scan.next();
			employee.setEmployeeName(name);
			System.out.println("enter your email:");
			email = scan.next();
			employee.setEmail(email);
			System.out.println("enter your salary:");
			salary = scan.nextDouble();
			employee.setSalary(salary);
			employeeDao.addEmployee(employee);
			System.out.println("Created Successfully");
			break;	
			
         case 2:
        	 System.out.println("enter your nameID:");
        	 nameid = scan.nextInt();
        	 employeeDao.getEmployee(nameid);		
			break;	
			
         case 3:
        	System.out.println("enter your nameID:");
        	nameid= scan.nextInt();
        	SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
    		Session session =  sessionfactory.openSession();
    		Employee e = (Employee)session.load(Employee.class,nameid);
    		employeeDao.updateEmployee(e);
    		session.close();
 			break;	
         case 4:
 			System.out.println("enter your nameID:");
 			nameid=scan.nextInt();
 			employeeDao.deleteEmployee(nameid);
 			break;	

		default:
			System.out.println("Please eneter a valid choice.");
			break;
		}			
	}

}
