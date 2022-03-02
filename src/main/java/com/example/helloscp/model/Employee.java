package com.example.helloscp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//"'ENTIFAADBV1'.'EMPLOYEES'"
@Table(name="EMPLOYEES")

public class Employee {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public long id;
	
	@Id
	@Column(name = "ID")
	public String id;
	
	@Column(name = "FIRST_NAME", nullable = false)
	public String firstName;
	
	@Column(name = "LAST_NAME")
	public String lastName;
	
	@Column(name = "EMAIL")
	public String email;
	
}
