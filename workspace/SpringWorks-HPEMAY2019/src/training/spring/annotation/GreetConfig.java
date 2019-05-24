package training.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetConfig {
	@Bean(name="english")
	public Greet english() {
		return new GreetEnglish(); 
	}
	
	@Bean(name="french")
	public Greet french() {
		return new GreetFrench(); 
	}
}
