package com.asoinspiration.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asoinspiration.client.domain.UserClient;



public interface UserClientDao extends JpaRepository<UserClient, String> {
	
	UserClient findByUserNameAndPassword(String userName,String password);

	UserClient findByEmail(String email);
}
