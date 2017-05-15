package Hibernetinheritance.tpcc;

import javax.persistence.*;



@Entity
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name")),
    @AttributeOverride(name="age", column=@Column(name="age")),
    @AttributeOverride(name="gender", column=@Column(name="gender"))
}) 
public class ContractEmployee extends Employee {
	private Integer no_of_hours;
	private float pay_per_hours;
	private Integer no_0f_year;
	public Integer getNo_of_hours() {
		return no_of_hours;
	}
	public void setNo_of_hours(Integer no_of_hours) {
		this.no_of_hours = no_of_hours;
	}
	public float getPay_per_hours() {
		return pay_per_hours;
	}
	public void setPay_per_hours(float pay_per_hours) {
		this.pay_per_hours = pay_per_hours;
	}
	public Integer getNo_0f_year() {
		return no_0f_year;
	}
	public void setNo_0f_year(Integer no_0f_year) {
		this.no_0f_year = no_0f_year;
	}
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param no_of_hours
	 * @param pay_per_hours
	 * @param no_0f_year
	 */
	public ContractEmployee(String name, Integer age, String gender, Integer no_of_hours, float pay_per_hours,
			Integer no_0f_year) {
		super(name, age, gender);
		this.no_of_hours = no_of_hours;
		this.pay_per_hours = pay_per_hours;
		this.no_0f_year = no_0f_year;
	}
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public ContractEmployee() {
		super();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public void setAge(Integer age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}
	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	

}
