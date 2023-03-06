package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.UserTypeRepository;
import com.akhm.repository.entity.UserTypeEntity;
import com.akhm.service.UserTypeService;

public class UserTypeServiceImpl implements UserTypeService{
	@Autowired
	private UserTypeRepository userTypeRepository;

	@Override
	public Integer insertUserTypeInteger(UserTypeEntity userTypeEntity) {
		try {
			UserTypeEntity userType=userTypeRepository.save(userTypeEntity);
			if(userType!=null)
			{
				return userType.getUserTypeId();
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public List<UserTypeEntity> getUserTypes() {
		try {
			return userTypeRepository.findAll();
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public void updateUserType(UserTypeEntity userTypeEntity) {
		userTypeRepository.save(userTypeEntity);
		
	}

	@Override
	public UserTypeEntity getUserType(Integer userTypeId) {
		try {
			Optional<UserTypeEntity>  optional=userTypeRepository.findById(userTypeId);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else
			{
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	
}
