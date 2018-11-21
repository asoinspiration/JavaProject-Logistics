package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.Export;

public interface ExportDao extends JpaRepository<Export, String>,JpaSpecificationExecutor<Export>{


}
