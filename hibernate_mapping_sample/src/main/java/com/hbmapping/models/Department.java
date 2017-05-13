package com.hbmapping.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
@Id
@GeneratedValue
private Integer dept_id;
@Column(length = 455)
private String  name;
@OneToMany(mappedBy = "department")
private List<Faculty> faculity= new ArrayList<>();

@OneToMany(mappedBy = "department")
private List<Course>course=new ArrayList<>();
@OneToMany(mappedBy = "department")
private List<Student>student=new ArrayList<>();
public Integer getDept_id() {
	return dept_id;
}
public void setDept_id(Integer dept_id) {
	this.dept_id = dept_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Faculty> getFaculity() {
	return faculity;
}
public void setFaculity(List<Faculty> faculity) {
	this.faculity = faculity;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public Department(String name, List<Faculty> faculity, List<Course> course, List<Student> student) {
	super();
	this.name = name;
	this.faculity = faculity;
	this.course = course;
	this.student = student;
}
public Department() {
	super();
}

}
