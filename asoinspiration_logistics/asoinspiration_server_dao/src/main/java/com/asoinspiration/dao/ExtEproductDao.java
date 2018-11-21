package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.ExtEproduct;

public interface ExtEproductDao extends JpaRepository<ExtEproduct, String>,JpaSpecificationExecutor<ExtEproduct>{


}
