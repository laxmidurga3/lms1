package com.akhm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.AdminRepository;
import com.akhm.repository.entity.AdminEntity;
import com.akhm.service.AdminService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminEntity getAdmin(String emailId, String password) {
		try {
			return adminRepository.findByEmailIdAndPassword(emailId, password);
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
		
	}
}
