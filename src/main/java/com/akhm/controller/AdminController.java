package com.akhm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.entity.AdminEntity;
import com.akhm.service.AdminService; 
@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	public ResponseEntity<AdminEntity> adminlogin(AdminEntity adminEntity)
	{
		try {
			AdminEntity admin=adminService.getAdmin(adminEntity.getEmailId(), adminEntity.getPassword());
			if(admin!=null)
			{
				return new ResponseEntity<AdminEntity>(admin,HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity(HttpStatus.UNAUTHORIZED);
			}
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
