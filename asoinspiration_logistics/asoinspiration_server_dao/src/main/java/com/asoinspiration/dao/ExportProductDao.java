package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.ExportProduct;

public interface ExportProductDao extends JpaRepository<ExportProduct, String>,JpaSpecificationExecutor<ExportProduct>{


}
