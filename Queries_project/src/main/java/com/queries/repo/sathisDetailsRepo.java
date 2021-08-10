package com.queries.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.queries.entity.sathisDetailsEntity;

public interface sathisDetailsRepo extends JpaRepository<sathisDetailsEntity, Serializable> {

	@Query(value = "select * from SATHISH_DTL where SATH_ID = :reg",
			nativeQuery = true)
	sathisDetailsEntity findDetailsnative(Integer reg);
	
	@Query(value = "select u from sathisDetailsEntity u where sathishId = :reg")
	sathisDetailsEntity findDetails(Integer reg);
	
}
