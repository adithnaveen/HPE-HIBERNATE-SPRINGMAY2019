package com.springbootworks.comhpespringboot.resourece;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springbootworks.comhpespringboot.beans.User;
import com.springbootworks.comhpespringboot.exceptions.UserNotFoundException;
import com.springbootworks.comhpespringboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userSerivce;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userSerivce.getAllUsers(); 
	}
	
	@GetMapping("/users/{userId}")
	public  org.springframework.hateoas.Resource<User>  getUser(@PathVariable int userId) throws UserNotFoundException {
		User user =  this.userSerivce.findOne(userId);
		
		if(user == null) {
			throw new 
			UserNotFoundException
				("Sorry User Not Found " + userId); 
		}

		org.springframework.hateoas.Resource<User> 
		resource =
			new org.springframework.hateoas.Resource<User>
				(user); 
		
		ControllerLinkBuilder linkTo = 
				ControllerLinkBuilder.linkTo(
						ControllerLinkBuilder.methodOn(
							this.getClass()).getAllUsers()); 
		
				resource.add(linkTo.withRel("all-users"));
		
				return resource; 


	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> 
	createUser(@RequestBody User user) {
		User savedUser = userSerivce.save(user); 
		
		// CREATED 
		// http://localhost:8080/{id}  
//		savedUser.getUserId()
		URI location = 
				ServletUriComponentsBuilder
				// http://localhost:8080/users
				.fromCurrentRequest()
				// http://localhost:8080/users/5
				.path("/{userId}")
				.buildAndExpand(savedUser.getUserId())
				.toUri(); 
		return ResponseEntity.created(location).build();  
	}
	
	
	
	
	@PostMapping("/usersadd")
	public User	createUser1(@RequestBody User user) {
		User savedUser = userSerivce.save(user); 
		  return savedUser; 
	}
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		User updatedUser = userSerivce.updateUser(user); 
		
		return updatedUser; 
	}
	
	
	
	
}
