package training.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import training.spring.autowire.Mobile;
import training.spring.autowire.MobileConfig;

public class P04_AutoWireExample {
	public static void main(String[] args) {
//		ApplicationContext context = new 
//				ClassPathXmlApplicationContext("ApplicationContext3.xml"); 

		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext
					(MobileConfig.class); 

		Mobile mobile = context.getBean("mobile", Mobile.class); 
		
		System.out.println(mobile.getCamera());
		System.out.println(mobile.getScreen());
		System.out.println(mobile.getSpeaker());
		
	}
}
