package com.jpa.study.jpa_store.jpo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.jpa.study.entity.TravelClub;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "info")
public class TravelClubJpo {
	
	@Id
	private long id;
	private String name;
	private String intro;
	private long foundationTime;
	
	public TravelClubJpo(TravelClub travelClub) {
//		this.id = travelClub.getId();
//		this.name = travelClub.getName();
//		this.intro = travelClub.getIntro();
//		this.foundationTime = travelClub.getFoundationTime();
		
		BeanUtils.copyProperties(travelClub,this);
	}
	
	public TravelClub toDomain() {
		TravelClub travelClub = new TravelClub(this.name, this.intro);
		travelClub.setId(this.id);
		travelClub.setFoundationTime(this.foundationTime);
		return travelClub;
	}
}
