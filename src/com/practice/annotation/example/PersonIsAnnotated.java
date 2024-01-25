package com.practice.annotation.example;

@JsonSerializable
public class PersonIsAnnotated {

	@JsonElement
	private String firstname;
	
	@JsonElement
	private String lastname;
	
	@JsonElement(key="perage")
	private String age;
	
	@JsonElement
	private String address;
	
	

	public PersonIsAnnotated(String firstname, String lastname, String age, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
	}

	private void initnames() {
		this.firstname=this.firstname.substring(0,1).toUpperCase()+this.firstname.substring(1);
		this.lastname=this.lastname.substring(0,1).toUpperCase()+this.lastname.substring(1);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
