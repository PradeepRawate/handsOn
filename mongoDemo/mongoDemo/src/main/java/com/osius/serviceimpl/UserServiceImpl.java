package com.osius.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.osius.entity.DepartmentDetails;
import com.osius.entity.User;
import com.osius.exception.BusinessException;
import com.osius.mongo.repository.UserRepository;
import com.osius.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String saveUser(User user) {
		String result;
		if(null == user.getId()) result = "User Created Successfully ! User Id is : ";
		else result = "User Updated Successfully ! User Id is : ";
		userRepository.save(user);
		return result + user.getId();
	}

	@Override
	public User getUser(String userId) {
		User user;
		try {
			user = userRepository.findOne(userId);
		} catch (DataAccessException e) {
			throw new BusinessException("404","User Not Found", e);
		}
		if(null == user) throw new BusinessException("404","User Not Found");
		return user;
	}

	@Override
	public String deleteUser(String userId) {
		User user = userRepository.findOne(userId);
		user.setIsActive(false);
		userRepository.save(user);
		return "User Deleted Successfully : " + user.getId();
	}

	@Override
	public List<User> getUsersByDepartment(String departmentId) {
		return userRepository.findByDepartmentId(departmentId);
	}

	@Override
	public List<DepartmentDetails> getDeptUsers() {
		return userRepository.getUsersCount();
	}
}
