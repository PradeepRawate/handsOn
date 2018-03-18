package com.osius.service;

import org.springframework.stereotype.Service;

import com.osius.entity.Department;

@Service
public interface DepartmentService {
	
	String saveDepartment(Department department);
	
	Department getDepartment(Integer id);

}
