package com.osius.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.osius.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByDepartmentId(Integer departmentId);
	
	@Query("select distinct d.name, count(u.id) from user u, department d where u.department.id = d.id group by d.id")
	Object[] get();
}
