package com.hbmapping.models;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer aid;
	private String plotno,state,country;
	private Integer pincode;
	@OneToOne(cascade={CascadeType.ALL})
	private Student student;
	@OneToOne(cascade={CascadeType.ALL})
	private Faculty faculty;
	public Address(String plotno, String state, String country, Integer pincode, Student student,
			Faculty faculty) {
		super();
		
		this.plotno = plotno;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.student = student;
		this.faculty = faculty;
	}
	public Address() {
		super();
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	


}
