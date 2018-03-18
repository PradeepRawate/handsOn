package com.osius.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
@Entity(name="user")
@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement(name="id")
	private Integer id;
	@XmlElement(name="fname")
	private String fname;
	private String lname;
	private String email;
	private Integer pinCode;
	private Date birthDate;
	private Boolean isActive;
//	@ManyToOne
	private Department department;
}
