package training.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.postprocessor.Employee;

public class P03_PostProcessor {
	public static void main(String[] args) {
		ApplicationContext context = 
					new ClassPathXmlApplicationContext
					("ApplicationContext.xml", 
					"ApplicationContext1.xml", 
					"ApplicationContext2.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println("Employee Id " + emp.getEmpId());
		System.out.println("Employee Email  " + emp.getEmpEmail());
		System.out.println("Emp First Name : " + emp.getName().getFirstName());
		System.out.println("Emp Last Name " + emp.getName().getLastName());
		
	}
}
