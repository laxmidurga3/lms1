package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhm.repository.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
	public AdminEntity findByEmailIdAndPassword(String emailId,String passwors); 
}
