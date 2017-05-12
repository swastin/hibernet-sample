package com.hibernate_sample.hibernet_embaded;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String plotno;
	private String ps;
	private String distrect;
	private String state;
	private String country;
	private String pincode;
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String plotno, String ps, String distrect, String state, String country, String pincode) {
		super();
		this.plotno = plotno;
		this.ps = ps;
		this.distrect = distrect;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [plotno=" + plotno + ", ps=" + ps + ", distrect=" + distrect + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	

}
