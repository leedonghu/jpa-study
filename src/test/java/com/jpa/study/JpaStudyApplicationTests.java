package com.jpa.study;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.study.entity.User;
import com.jpa.study.entity.User02;
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
	
	
//	@Test
//	@Order(1)
//	void save() {
//		User02 user = new User02();
//		user.setFirstName("qwe");
//		user.setLastName("asd");
//		userRepository.save(user);
//		
//		user.setFirstName("tty");
//		user.setLastName("ppo");
//		userRepository.save(user);
//		
//		user.setFirstName("abc");
//		user.setLastName("def");
//		userRepository.save(user);
//		
//		user.setFirstName("ghi");
//		user.setLastName("jkl");
//		userRepository.save(user);
//		
//		user.setFirstName("mno");
//		user.setLastName("pqr");
//		userRepository.save(user);
//		
//		user.setFirstName("stu");
//		user.setLastName("vwx");
//		userRepository.save(user);
//		
//		user.setFirstName("stu");
//		user.setLastName("123");
//		userRepository.save(user);
//		
//		user.setFirstName("STu");
//		user.setLastName("124");
//		userRepository.save(user);
//		
//		user.setFirstName("STU");
//		user.setLastName("ABD");
//		userRepository.save(user);
//		
//		user.setFirstName("yza");
//		user.setLastName("bcd");
//		userRepository.save(user);
//		
//		user.setFirstName("efg");
//		user.setLastName("hij");
//		userRepository.save(user);
//	}
//	
//	@Test
//	@Order(2)
//	void select() {
//		List<User02> userList = userRepository.findFirst5ByLastNameAndFirstNameOrderByUserIdDesc("vwx", "stu");
//		for(User02 u : userList) {
//			log.info(u.getFirstName() + " | " + u.getLastName());
//		}
//	}
//	
//	@Test
//	@Order(3)
//	void select02() {
//		List<User02> userList = userRepository.findAll();
//		for(User02 u : userList) {
//			log.info("findAll : "+u.getFirstName() + " | " + u.getLastName());
//		}
//	}
//	
//	@Test
//	@Order(4)
//	void select03() {
//		boolean check = userRepository.existsByStartDateLessThanEqual(LocalDateTime.now());
//		log.info(String.valueOf(check));
//	}
//	
//	@Test
//	@Order(5)
//	void select04() {
//		long cnt = userRepository.conutByFirstNameIgnoreCaseLike("stu%");
//		log.info(String.valueOf(cnt));
//		
//	}

}
