package Hibernetinheritance.tpcc;
import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Employee(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * 
	 */
	public Employee() {
	}
	

}
