package com.osius.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.osius.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom {

	List<User> findByDepartmentId(String departmentId);
	
//	@Query("select distinct d.name, count(u.id) from user u, department d where u.department.id = d.id group by d.id")
//	Object[] get();
}
