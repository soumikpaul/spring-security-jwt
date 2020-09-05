package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SecurityexampleApplication implements CommandLineRunner{
	 @Autowired
	  UserRepository userRepository;

	  public static void main(String[] args) {
	    SpringApplication.run(SecurityexampleApplication.class, args);
	  }

	  @Override
	  public void run(String... args) throws Exception {
	    userRepository.save(new User("s","$2a$10$15GPE8Q.LGbTvrw6IcIwJ.pHOAuST0MS6rp9kejXGdJ9OHHmVrcf2","USER"));
	    //userRepository.save(new User("Paul", "paul", "PAUL"));
	  }
}
