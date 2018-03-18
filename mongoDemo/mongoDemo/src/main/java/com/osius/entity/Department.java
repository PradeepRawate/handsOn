package com.osius.entity;

import java.util.Set;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Department {
	
	@Id
	private String id;
	private String name;
	private static String organization = "OSI";
	private Set<User> users;

}
