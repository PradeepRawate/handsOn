package com.osius.mongo.repository;

import java.util.List;

import com.osius.entity.DepartmentDetails;
import com.osius.entity.User;

public interface UserRepositoryCustom {

	List<DepartmentDetails> getUsersCount();
}
