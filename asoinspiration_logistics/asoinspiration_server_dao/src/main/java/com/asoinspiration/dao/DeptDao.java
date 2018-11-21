package com.asoinspiration.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.asoinspiration.domain.Dept;

public interface DeptDao extends JpaRepository<Dept , String>,JpaSpecificationExecutor<Dept>{

	@Query("from  Dept where deptName=?1")
	public List<Dept>findDeptByName(String name);
	
	public List<Dept> findDeptByState(Integer string);
	
	public List<Dept> findDeptByDeptNameLike(String name);
	
	@Query(value="select * from dept_p where dept_Name =? and state=?" ,nativeQuery=true)
	public List<Dept> findNameAndState(String name, Integer state);
}
