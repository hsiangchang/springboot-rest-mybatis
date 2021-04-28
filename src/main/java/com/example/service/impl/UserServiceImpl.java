package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper ;
	
	@Override
	public List<UserEntity> queryAll() {
		return userMapper.queryAll();
	}

	@Override
	public void insert(UserEntity userEntity) {
		userMapper.insert(userEntity);
	}

}
