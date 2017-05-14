package com.hbmaping.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private long aid;
	private String plotno,distrect,state,country;
	private Integer pincode;
	@ManyToMany(cascade={CascadeType.ALL})
	private List<User> owners = new ArrayList<>();
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	public String getDistrect() {
		return distrect;
	}
	public void setDistrect(String distrect) {
		this.distrect = distrect;
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
	public List<User> getOwners() {
		return owners;
	}
	public void setOwners(List<User> owners) {
		this.owners = owners;
	}
	/**
	 * @param aid
	 * @param plotno
	 * @param distrect
	 * @param state
	 * @param country
	 * @param pincode
	 * @param owners
	 */
	public Address(long aid, String plotno, String distrect, String state, String country, Integer pincode,
			List<User> owners) {
		this.aid = aid;
		this.plotno = plotno;
		this.distrect = distrect;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.owners = owners;
	}
	/**
	 * 
	 */
	public Address() {
	}
	
	
}
