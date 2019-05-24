package training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping("/hello.html")
	public ModelAndView helloWorld() {
		String message= "Welcome to HPE";
		// first Param - view name 
		// second param - key for message 
		// thrid param  - actual value 
		
		return new ModelAndView("hello", "message", message); 
	}
	
	
	
	// WEB-INF/views/index.jsp 
	// http://localhost:8080//SpringMVC-HPE2019/
	@RequestMapping("/")
	public String indexFile() {
		return "index"; 
	}
	
}
