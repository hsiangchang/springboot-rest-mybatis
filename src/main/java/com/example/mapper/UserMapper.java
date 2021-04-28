package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.UserEntity;

@Mapper
public interface UserMapper {

	List<UserEntity> queryAll();
	
	void insert(UserEntity userEntity);
	
}
