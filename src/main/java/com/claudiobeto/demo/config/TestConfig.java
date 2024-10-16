package com.claudiobeto.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.claudiobeto.demo.entities.Order;
import com.claudiobeto.demo.entities.User;
import com.claudiobeto.demo.repositories.OrderRepository;
import com.claudiobeto.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Assibo", "assiboMussa@gmail.com", "12345");
		User u2 = new User(null, "Jorge", "jorge2345@gmail.com", "0987765");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Order o1 = new Order(null, Instant.parse("2024-10-18T18:15:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2024-10-18T20:15:07Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2024-10-18T19:15:07Z"), u1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
	
}
