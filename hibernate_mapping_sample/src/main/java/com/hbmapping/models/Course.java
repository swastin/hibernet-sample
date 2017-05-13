package com.hbmapping.models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Integer course_id;
	@Column(length = 455)
	private String name;
	@ManyToOne
	private Faculty faculty;
	@OneToMany(mappedBy = "course")
	private List<Student> student= new ArrayList <>();
	@ManyToOne
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Course(String name, Faculty faculty, List<Student> student) {
		super();
		this.name = name;
		this.faculty = faculty;
		this.student = student;
	}
	public Course() {
		super();
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
	
	
	

}
