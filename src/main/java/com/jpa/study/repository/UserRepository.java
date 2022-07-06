package com.jpa.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.study.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findFirst2ByUsernameLikeOrderByIDDesc(String name);
}
