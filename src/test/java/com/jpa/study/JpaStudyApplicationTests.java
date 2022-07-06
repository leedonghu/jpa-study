package com.jpa.study;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.study.entity.User;
import com.jpa.study.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Slf4j
class JpaStudyApplicationTests {
	
	@Autowired(required = true)
	UserRepository userRepository;
	
	@Test
	@Order(1)
	void save() {
		User user = new User();
		user.setUsername("lee");
		userRepository.save(user);
		
		user = new User();
		user.setUsername("kim");
		userRepository.save(user);
		
		user = new User();
		user.setUsername("choi");
		userRepository.save(user);
		
		user = new User();
		user.setUsername("park");
		userRepository.save(user);
	}
	
	
	@Test
	@Order(2)
	void select() {
		List<User> userList = userRepository.findAll();
		for(User u : userList) {
			log.info("findAll : " + u.getID() + " | " + u.getUsername());
		}
		
	}
	
	@Test
	@Order(3)
	void select2() {
		List<User> userList = userRepository.findFirst2ByUsernameLikeOrderByIDDesc("kim%");
		for(User u : userList) {
			log.info("findAll : " + u.getID() + " | " + u.getUsername());
		}
	}

}
