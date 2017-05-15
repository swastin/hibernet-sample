package Hibernetinheritance.tpcc;

import javax.persistence.*;
@Entity
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name")),
    @AttributeOverride(name="age", column=@Column(name="age")),
    @AttributeOverride(name="gender", column=@Column(name="gender"))
}) 
public class RegularEmployee extends Employee {
private float Annual_salary;

public float getAnnual_salary() {
	return Annual_salary;
}

public void setAnnual_salary(float annual_salary) {
	Annual_salary = annual_salary;
}

/**
 * @param name
 * @param age
 * @param gender
 * @param annual_salary
 */
public RegularEmployee(String name, Integer age, String gender, float annual_salary) {
	super(name, age, gender);
	Annual_salary = annual_salary;
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

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

/**
 * @param name
 * @param age
 * @param gender
 */
public RegularEmployee() {
	super();
}

}
