package com.osius.serviceimpl;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osius.entity.Department;
import com.osius.entity.User;
import com.osius.exception.BusinessException;
import com.osius.mongo.repository.DepartmentRepository;
import com.osius.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository repositry;

	@Autowired
	private UserServiceImpl userService;

	@Override
	public String saveDepartment(Department department) {
		if (null != repositry.save(department))
			return "";
		else
			throw new BusinessException("500", "Department creation Failed");
	}

	@Override
	public Department getDepartment(String id) {
		List<User> users = userService.getUsersByDepartment(id);
		Department department = repositry.findOne(id);
		department.setUsers(new HashSet(users));
		return department;
	}
	
}
