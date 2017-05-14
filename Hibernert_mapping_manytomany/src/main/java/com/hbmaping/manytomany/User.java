package com.hbmaping.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
   @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.ALL})
   private List<Address> addresses = new ArrayList<>();
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public List<Address> getAddresses() {
	return addresses;
}
public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}
/**
 * @param id
 * @param name
 * @param email
 * @param addresses
 */
public User(Long id, String name, String email, List<Address> addresses) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.addresses = addresses;
}
/**
 * 
 */
public User() {
}

}
