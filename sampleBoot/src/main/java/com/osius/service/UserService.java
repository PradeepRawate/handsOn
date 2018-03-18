package com.osius.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.osius.entity.User;

@Component
public interface UserService {

	public String saveUser(User user);

	public User getUser(Integer userId);

	public String deleteUser(Integer userId);

	public List<User> getUsersByDepartment(Integer deptId);

}
