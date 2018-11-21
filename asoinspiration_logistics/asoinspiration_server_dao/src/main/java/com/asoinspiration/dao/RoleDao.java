package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.Role;



public interface RoleDao extends JpaRepository<Role, String>,JpaSpecificationExecutor<Role>{

}
