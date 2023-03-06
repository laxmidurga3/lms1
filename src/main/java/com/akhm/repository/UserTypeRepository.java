package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.entity.UserTypeEntity;
@Repository
public interface UserTypeRepository extends JpaRepository<UserTypeEntity, Integer> {
	
}
