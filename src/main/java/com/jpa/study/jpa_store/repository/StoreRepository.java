package com.jpa.study.jpa_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.study.jpa_store.jpo.TravelClubJpo;

@Repository
public interface StoreRepository extends JpaRepository<TravelClubJpo, Long> {

}
