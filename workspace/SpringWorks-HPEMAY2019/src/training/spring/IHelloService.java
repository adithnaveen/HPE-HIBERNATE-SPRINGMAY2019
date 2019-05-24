package training.spring;

public interface IHelloService {
	// the name of the user will be injected by 
	// external resources 
	public String sayHello(); 
	
	// if you want to invoke it inside the class 
	public String sayHello(String name, String city); 
}
