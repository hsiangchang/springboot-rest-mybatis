package com.example.service;

import java.util.List;

import com.example.entity.UserEntity;

public interface UserService {

	List<UserEntity> queryAll();

	void insert(UserEntity userEntity);
	
}
