package com.akhm.service;

import com.akhm.repository.entity.AdminEntity;

public interface AdminService {
	public AdminEntity getAdmin(String emailId,String password);
}
