package com.akhm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.entity.UserTypeEntity;
import com.akhm.service.UserTypeService;

@RestController
public class UserTypeController {
	@Autowired(required = false)
	private UserTypeService userTypeService;

	@PostMapping("/userType/save")
	public ResponseEntity<Integer> saveUserType(@RequestBody UserTypeEntity userTypeEntity) {
		try {

			return new ResponseEntity<>(userTypeService.insertUserTypeInteger(userTypeEntity), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/userType/get")
	public ResponseEntity<List<UserTypeEntity>> getUserTypes() {
		try {
			List<UserTypeEntity> userTypes = userTypeService.getUserTypes();
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/userType/get/{userTypeId}")
	public ResponseEntity<UserTypeEntity> getUserType(@PathVariable Integer userTypeId)
	{
		try {
			UserTypeEntity userType=userTypeService.getUserType(userTypeId);
			return new ResponseEntity<>(userType,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/userType/update")
	public ResponseEntity<Void> updateUserType(@RequestBody UserTypeEntity userTypeEntity) {
		try {

			userTypeService.updateUserType(userTypeEntity);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
