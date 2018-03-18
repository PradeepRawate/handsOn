package com.osius.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import lombok.Data;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private static String organization = "OSI";
	
	@JsonIgnore
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
	private Set<User> users;

}
