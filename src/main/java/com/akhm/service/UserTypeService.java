package com.akhm.service;

import java.util.List;

import com.akhm.repository.entity.UserTypeEntity;

public interface UserTypeService {
	public Integer insertUserTypeInteger(UserTypeEntity userTypeEntity);
	public List<UserTypeEntity> getUserTypes();
	public void updateUserType(UserTypeEntity userTypeEntity);
	public UserTypeEntity getUserType(Integer userTypeId);
}
