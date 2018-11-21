package com.asoinspiration.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asoinspiration.client.domain.CompanyClient;

public interface CompanyDao extends JpaRepository<CompanyClient, String> {

}
