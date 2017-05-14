package com.mapping.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, orphanRemoval = true)
	private List <Contacts> contact=new ArrayList<>();
    private Integer age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Contacts> getContact() {
		return contact;
	}
	public void setContact(List<Contacts> contact) {
		this.contact = contact;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getId() {
		return id;
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param contact
	 * @param age
	 * @param sex
	 */
	public User(Integer id, String name, String email, List<Contacts> contact, Integer age, String sex) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * 
	 */
	public User() {
	}
    
}
