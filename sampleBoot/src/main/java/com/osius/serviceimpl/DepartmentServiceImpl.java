package com.osius.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osius.entity.Department;
import com.osius.exception.BusinessException;
import com.osius.repository.DepartmentRepository;
import com.osius.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository repositry;

	@Override
	public String saveDepartment(Department department) {
		if(null != repositry.save(department)) 
			return "";
		else throw new BusinessException("500", "Department creation Failed");
	}

	@Override
	public Department getDepartment(Integer id) {
		return repositry.findOne(id);
	}

}
