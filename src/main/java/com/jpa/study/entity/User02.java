package com.jpa.study.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User02 {
	
	@Id
	private long userId;
	
	//쿼리 메서드 사용시 첫글자 대분자 불가능
	// 언더바 _ 같은 기호도 인식 불가
	// 그럴때 @Column 어노테이션 사용
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "Last_name")
	private String lastName;
	
	private LocalDateTime startDate;
}
