package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.ExtCproduct;

public interface ExtCproductDao extends JpaRepository<ExtCproduct, String>,JpaSpecificationExecutor<ExtCproduct>{

	
}
