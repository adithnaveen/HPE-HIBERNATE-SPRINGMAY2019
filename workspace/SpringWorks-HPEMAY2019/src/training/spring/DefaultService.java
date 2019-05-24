package training.spring;

public class DefaultService implements IHelloService{

	
	private String name; 
	private String city; 
	
	public DefaultService() {
		System.out.println("Default Constructor Invoked for Default Service... ");
	}
	
	
	public DefaultService(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String sayHello() {
		return sayHello(name, city); 
	}

	@Override
	public String sayHello(String name, String city) {
		String myStr[] = {
			"Hey How are you Mr/Ms/Mrs : %s how is your city %s", 
			"Good Morning Mr/Ms/Mrs: %s, and heare you are in %s", 
			"Mr/Ms/Mrs %s, good to be in your city %s" 
		}; 
		
		int randomNumber = (int) (Math.random() * 3); 
		
		return String.format(myStr[randomNumber], name, city); 
	}

	public void init() {
		System.out.println("This is init in Default service");
	}
	
	public void destroy() {
		System.out.println("This is destroy in Default Service... ");
	}
	
	
	
	
}
