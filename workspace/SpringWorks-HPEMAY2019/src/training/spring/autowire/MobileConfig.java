package training.spring.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {

	@Bean(name="mobile")
	public Mobile getMobile() {
		return new Mobile(); 
	}
	
	@Bean(name="speaker")
	public Speaker getSpeaker() {
		return new Speaker(); 
	}
	
	@Bean(name="screen")
	public Screen getScreen() {
		return new Screen(); 
	}
	
	@Bean(name="camera")
	public Camera getCamera() {
		return new Camera(); 
	}
	
	
}
