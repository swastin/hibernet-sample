package com.hbmapping.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;
	@OneToOne(cascade = {CascadeType.ALL})
	private Department department;
	@OneToOne(cascade = {CascadeType.ALL})
	private Course course;
	public Student(String name, Integer age, String gender, Address address, Department department, Course course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.department = department;
		this.course = course;
	}
	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
