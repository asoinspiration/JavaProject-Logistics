package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.Factory;

public interface FactoryDao extends JpaRepository<Factory, String>,JpaSpecificationExecutor<Factory>{

}
