package com.asoinspiration.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asoinspiration.dao.DeptDao;
import com.asoinspiration.domain.Dept;
import com.asoinspiration.service.DeptService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JpaTest {

	@Autowired
	private DeptDao deptDao;
	
	@Autowired
	private DeptService deptService;

	
	@Test
	public void testFindDept(){
		Dept dept = deptDao.findOne("100");
		System.out.println(dept.getDeptName());
	}
	
	@Test
	public void testAddDept(){
		Dept dept = new Dept();
		dept.setDeptName("测试部门");
		dept.setState(1);
		
		deptService.saveOrUpdate(dept);
		System.out.println("新增完成");
	}
	
	@Test
	public void testFindDept2() {
//		List<Dept> deptList = deptDao.findDeptByState(1);
//		for(Dept dept : deptList) {
//			System.out.println(dept);
//		}
		
//		List<Dept> deptList = deptDao.findDeptByDeptNameLike("%部%");
//		for(Dept dept : deptList) {
//			System.out.println(dept);
//		}
		
		List<Dept> deptList = deptDao.findNameAndState("测试部门", 1);
		for(Dept dept : deptList) {
			System.out.println(dept);
		}
	}
	
	
}
