package training.spring.annotation;

import org.springframework.beans.factory.annotation.Value;

public class GreetEnglish implements Greet{

	@Value("Kumar")
	private String name; 
	
	@Override
	public String goodMorning() {
		return "Good Morning";
	}

	@Override
	public String goodEvening() {
		return "Good Evening"; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
