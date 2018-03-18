package com.osius.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.osius.entity.Department;
import com.osius.entity.DepartmentDetails;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
	
}
