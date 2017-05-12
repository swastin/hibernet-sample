package hibernet_mapping_one2one.hibernet_mapping;

import javax.persistence.*;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer aid;
	private String plotno,ps,distrect,state,country;
	private Integer pincode;
	@OneToOne(cascade={CascadeType.ALL})
	private User user;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Address(String plotno, String ps, String distrect, String state, String country, Integer pincode) {
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

