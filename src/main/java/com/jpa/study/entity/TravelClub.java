package com.jpa.study.entity;

import lombok.Data;

@Data
public class TravelClub {
	private long id;
	private String name;
	private String intro;
	private long foundationTime;
	
	public TravelClub(String name, String intro) {
		this.name = name;
		this.intro = intro;
	}
}
