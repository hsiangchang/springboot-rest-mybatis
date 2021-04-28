package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RestResponse;
import com.example.entity.UserEntity;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<UserEntity> queryAll(){
		return userService.queryAll();
	}
	
	@PostMapping("/user")
	public RestResponse insert(@RequestBody UserEntity userEntity) {
		
		userService.insert(userEntity);
		
		RestResponse response = new RestResponse();
		response.setCode("000");
		response.setMessage("success");
		return response ;
	}
	
}
