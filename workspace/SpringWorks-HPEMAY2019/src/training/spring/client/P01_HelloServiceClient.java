package training.spring.client;

import javax.sql.rowset.serial.SerialArray;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import training.spring.DefaultService;
import training.spring.IHelloService;

public class P01_HelloServiceClient {
	public static void main(String[] args) {
		
//		XmlBeanFactory factory = new XmlBeanFactory
//			(new ClassPathResource("ApplicationContext.xml"));

		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml"	); 
		
		IHelloService service =  
				context.getBean("hello", IHelloService.class); 

		IHelloService service1 =  
				context.getBean("hello", IHelloService.class); 
		
		System.out.println(service.sayHello());
		System.out.println(service1.sayHello());
		
		context.registerShutdownHook(); 
	}
}
