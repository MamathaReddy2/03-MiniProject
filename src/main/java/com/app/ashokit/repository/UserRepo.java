package com.app.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ashokit.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Serializable>
{
	public UserEntity findByUserEmail(String email);

}
