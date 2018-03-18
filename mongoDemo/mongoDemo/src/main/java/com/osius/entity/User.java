package com.osius.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="users")
@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@XmlElement(name="id")
	private String id;
	@XmlElement(name="fname")
	private String fname;
	private String lname;
	private String email;
	private Integer pinCode;
	private Date birthDate;
	private Boolean isActive;
	private String departmentId;
}
