package com.jpa.study.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	private String username;
}
