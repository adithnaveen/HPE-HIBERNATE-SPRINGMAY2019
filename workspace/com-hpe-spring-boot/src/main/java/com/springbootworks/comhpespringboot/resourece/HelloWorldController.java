package com.springbootworks.comhpespringboot.resourece;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootworks.comhpespringboot.beans.Hello;

@RestController
public class HelloWorldController {
	
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		return "Hello World"; 
	}
	
	@GetMapping(path="/hello-world-bean")
	public Hello helloWorldBean() {
		return new Hello("HPE"); 
	}
	
	// http://localhost:8080/hello-world-bean/Naveen
	@GetMapping(path="/hello-world-bean/{name}")
	public Hello getHelloPathParam(@PathVariable String name) {
		return new Hello
			(String.format("Hello Welcome: %s", name)); 
	}
	
	
	
	
	
	
	
	
	
}
