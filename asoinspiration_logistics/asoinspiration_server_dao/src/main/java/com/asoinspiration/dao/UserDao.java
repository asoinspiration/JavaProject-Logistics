package com.asoinspiration.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.asoinspiration.domain.User;

public interface UserDao extends JpaRepository<User, String>,JpaSpecificationExecutor<User>{


}
