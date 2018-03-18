package com.osius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osius.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
