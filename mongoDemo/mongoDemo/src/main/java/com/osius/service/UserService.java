package com.osius.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.osius.entity.DepartmentDetails;
import com.osius.entity.User;

@Component
public interface UserService {

	public String saveUser(User user);

	public List<User> getUsersByDepartment(String deptId);

	User getUser(String userId);

	String deleteUser(String userId);

	public List<DepartmentDetails> getDeptUsers();

}
