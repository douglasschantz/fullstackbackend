package com.schantzdouglas.fullstackbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schantzdouglas.fullstackbackend.model.User;
import com.schantzdouglas.fullstackbackend.repository.UserRepository;

@RestController
//@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;	
	
	/*@GetMapping
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> listar() {
		System.out.println("teste");
		return ResponseEntity.ok().body("lista de usarios");
	}*/
	
	@GetMapping("/users")
    public String home(){
        return "Hello World!";
    }

	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

}
