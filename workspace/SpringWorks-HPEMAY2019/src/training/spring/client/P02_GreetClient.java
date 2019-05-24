package training.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import training.spring.annotation.Greet;
import training.spring.annotation.GreetConfig;
import training.spring.annotation.GreetEnglish;
import training.spring.annotation.GreetFrench;

public class P02_GreetClient {
	public static void main(String[] args) {
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(GreetConfig.class); 

		Greet greetEnglish = context.getBean("english", GreetEnglish.class); 
		System.out.println(greetEnglish.goodMorning());
		System.out.println(greetEnglish.goodEvening());
		System.out.println(
		((GreetEnglish)greetEnglish).getName()); 
		
		
		Greet greetFrench = context.getBean("french", GreetFrench.class); 
		System.out.println(greetFrench.goodMorning());
		System.out.println(greetFrench.goodEvening());
		
		
		
	}
}
