package com.jpa.study.jpa_store.jpo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class TravelClubJpo {
	
	@Id
	private String id;
	private String name;
	private String intro;
	private long foundationTime;
}
