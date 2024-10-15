package com.claudiobeto.demo.resourse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudiobeto.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u= new User(1L, "beto", "beto@gmail.com", "123456");
		return ResponseEntity.ok().body(u);
	}

}
