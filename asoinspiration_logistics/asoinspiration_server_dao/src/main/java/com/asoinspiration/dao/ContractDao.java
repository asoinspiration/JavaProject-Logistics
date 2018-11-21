package com.asoinspiration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asoinspiration.domain.Contract;

public interface ContractDao extends JpaRepository<Contract, String>,JpaSpecificationExecutor<Contract>{


}
