package training.spring.annotation;

public class GreetFrench implements Greet {

	@Override
	public String goodMorning() {
		return "Bon Jour"; 
	}

	@Override
	public String goodEvening() {
		return "Bonsoir"; 
	}

}
