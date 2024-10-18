package com.claudiobeto.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.claudiobeto.demo.entities.User;
import com.claudiobeto.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Assibo", "assiboMussa@gmail.com", "12345");
		User u2 = new User(null, "Jorge", "jorge2345@gmail.com", "0987765");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
