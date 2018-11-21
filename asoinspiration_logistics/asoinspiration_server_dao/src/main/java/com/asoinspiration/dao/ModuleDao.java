package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.Module;



public interface ModuleDao extends JpaRepository<Module, String>,JpaSpecificationExecutor<Module>{

}
