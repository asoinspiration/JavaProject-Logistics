package com.asoinspiration.service.Impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.asoinspiration.dao.FactoryDao;
import com.asoinspiration.domain.Factory;
import com.asoinspiration.service.FactoryService;
import com.asoinspiration.utils.UtilFuns;


@Service
public class FactoryServiceImpl implements FactoryService{

	@Autowired
	private FactoryDao factoryDao;
	
	@Override
	public List<Factory> find(Specification<Factory> spec) {
		// TODO Auto-generated method stub
		return factoryDao.findAll(spec);
	}

	@Override
	public Factory get(String id) {
		// TODO Auto-generated method stub
		return factoryDao.findOne(id);
	}

	@Override
	public Page<Factory> findPage(Specification<Factory> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return factoryDao.findAll(spec, pageable);
	}

	@Override
	public void saveOrUpdate(Factory entity) {
		// TODO Auto-generated method stub
		if(UtilFuns.isEmpty(entity.getId())){ // 判断修改或者新增
			
		}else{
			
		}
		
		factoryDao.save(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<Factory> entitys) {
		// TODO Auto-generated method stub
		factoryDao.save(entitys);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		factoryDao.delete(id);
	}

	@Override
	public void delete(String[] ids) {
		// TODO Auto-generated method stub
		for (String id : ids) {
			factoryDao.delete(id);
		}
	}

}
