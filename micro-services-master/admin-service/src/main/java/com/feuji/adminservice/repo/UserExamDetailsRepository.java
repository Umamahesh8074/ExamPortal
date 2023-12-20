package com.feuji.adminservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feuji.commonmodel.UserExamDetails;

public interface UserExamDetailsRepository extends JpaRepository<UserExamDetails, Integer> {
	
	UserExamDetails findByUserIdAndExamId(Long uid,Long eid);
	
}
