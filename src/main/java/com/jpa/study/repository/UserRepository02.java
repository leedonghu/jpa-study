package com.jpa.study.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.study.entity.User02;

@Repository
public interface UserRepository02 extends JpaRepository<User02, Long> {
	
	//lastname과 firstname이 입력받은 값과 일치하는 User들을 userId 역순으로 정렬을 하여 5개 데이터만 가져옴
	//select *
//	from user
//	where last_name=?
//	and first_name=?
//	order by user_id desc limit 5
	List<User02> findFirst5ByLastNameAndFirstNameOrderByUserIdDesc(String lastName, String firstName);
	
	
	//입력받은 날짜보다 startDate가 적거나 같은(<=) 데이터가 있다면 true를 없다면 false를 리턴하는 메서드
	Boolean existsByStartDateLessThanEqual(LocalDateTime startDate);
	
	//대소문자를 무시하고 LIKE 쿼리를 날려서 해당되는 데이터의 수를 가져옴
	long conutByFirstNameIgnoreCaseLike(String firstName);
}
