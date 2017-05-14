package com.mapping.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contacts {
	@Id
	@GeneratedValue
	private Integer id;
	private String phone_number;
    @ManyToOne(cascade = CascadeType.ALL)
	private User user;
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	/**
	 * @param phone_number
	 * @param user
	 */
	public Contacts(String phone_number, User user) {
		this.phone_number = phone_number;
		this.user = user;
	}
	/**
	 * 
	 */
	public Contacts() {
	}

}
