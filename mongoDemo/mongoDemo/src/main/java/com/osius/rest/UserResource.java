package com.osius.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.osius.entity.DepartmentDetails;
import com.osius.entity.User;
import com.osius.exception.BusinessException;
import com.osius.exception.RestServiceException;
import com.osius.mongo.repository.UserRepository;
import com.osius.service.UserService;


@RestController
@RequestMapping("/api")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@PutMapping("/user")
	public String createUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@PostMapping("/user")
	public String updateUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/user/{userId}")
	public User fetchUser(@PathVariable("userId") String userId) throws RestServiceException {
		try {
			return userService.getUser(userId);
		} catch (BusinessException e) {
			throw new RestServiceException(HttpStatus.NOT_FOUND.value(), e.getErrorMessage(), e.getErrorCode(), e.getMessage());
		}
	}
	
	@GetMapping("/usersByDepartment/{deptId}")
	public List<User> getUsersByDepartment(@PathVariable("deptId") String deptId) throws RestServiceException {
		try {
			return userService.getUsersByDepartment(deptId);
		} catch (BusinessException e) {
			throw new RestServiceException(HttpStatus.NOT_FOUND.value(), e.getErrorMessage(), e.getErrorCode(), e.getMessage());
		}
	}
	
	@GetMapping("/department-details")
	public List<DepartmentDetails> getDepartmentUsers() throws RestServiceException {
		try {
			return userService.getDeptUsers();
		} catch (BusinessException e) {
			throw new RestServiceException(HttpStatus.NOT_FOUND.value(), e.getErrorMessage(), e.getErrorCode(), e.getMessage());
		}
	}
	
//	@GetMapping("/test/{deptId}")
//	public Object[] test(@PathVariable("deptId") Integer deptId) throws RestServiceException {
//		try {
//			return userRepository.get();
//		} catch (BusinessException e) {
//			throw new RestServiceException(HttpStatus.NOT_FOUND.value(), e.getErrorMessage(), e.getErrorCode(), e.getMessage());
//		}
//	}
	
	@RequestMapping(value="/uploadFile", method=RequestMethod.POST)
    public User handleFileUpload(@RequestParam("file") MultipartFile file) {
		System.err.println(file);
		User user = new User();
		user.setId("4");
		user.setFname("Pradeep");
		return user;
    }
	
	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable("userId") String userId) {
		return userService.deleteUser(userId);
	}
}
