package com.hbmapping.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Faculty{
	@Id
	@GeneratedValue
	private String fid;
	private String name;
	private String age;
	private String gender;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;
	private Date date_of_join;
	@OneToOne
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@OneToMany
	private List<Course> course= new ArrayList<>();
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getDate_of_join() {
		return date_of_join;
	}
	public void setDate_of_join(Date date_of_join) {
		this.date_of_join = date_of_join;
	}
		public Faculty(String name, String age, String gender, Address address, Date date_of_join, Department department,
			List<Course> course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.date_of_join = date_of_join;
		this.department = department;
		this.course = course;
	}
	public Faculty() {
		super();
	}
	

}
