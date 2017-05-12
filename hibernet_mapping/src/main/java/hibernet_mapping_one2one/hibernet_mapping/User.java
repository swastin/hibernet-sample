package hibernet_mapping_one2one.hibernet_mapping;
import javax.persistence.CascadeType;
/***pojo class/persistance /model class***/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;
	public User(int id, String name, String email, String password, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [address=" + address + ", email=" + email + ", id=" + id + ", name=" + name + ", password="
				+ password + "]";
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}

}
