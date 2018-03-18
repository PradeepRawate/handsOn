package com.osius.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osius.entity.Department;
import com.osius.exception.BusinessException;
import com.osius.exception.RestServiceException;
import com.osius.service.DepartmentService;


@RestController
@RequestMapping("/api")
public class DepartmentResource {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public String updateDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/department/{departmentId}")
	public Department fetchDepartment(@PathVariable("departmentId") Integer departmentId) throws RestServiceException {
		try {
			return departmentService.getDepartment(departmentId);
		} catch (BusinessException e) {
			throw new RestServiceException(HttpStatus.NOT_FOUND.value(), e.getErrorMessage(), e.getErrorCode(), e.getMessage());
		}
	}
	
}
