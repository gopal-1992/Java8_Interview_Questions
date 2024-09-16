package com.gopal;

import java.util.Objects;

public class Employee {
	private String name;
	private String city;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override  
    public int hashCode() {  
        int hash = 7;  
        hash = 79 * hash + Objects.hashCode(this.name);  
        hash = 79 * hash + Objects.hashCode(this.city);  
        hash = 79 * hash + this.age;  
        return hash;  
    }  

	@Override  
    public boolean equals(Object obj) {  
        if (obj == null) {  
            return false;  
        }  
        if (getClass() != obj.getClass()) {  
            return false;  
        }  
        final Employee other = (Employee) obj;  
        if (!Objects.equals(this.name, other.name)) {  
            return false;  
        }  
        if (!Objects.equals(this.city, other.city)) {  
            return false;  
        }  
        if (this.age != other.age) {  
            return false;  
        }  
        return true;  
    }  

	public Employee(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	

}
