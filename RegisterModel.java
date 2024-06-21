package com.java.model;

public class RegisterModel {
	
	private String name; 
	private String email; 
	private String password;
	private String confirm;
	private String phone;
	private String dob;
	private String gender;
	private String country;
	
	public RegisterModel() {
		super();
	}

	public RegisterModel(String name, String email, String password, String confirm, String phone, String dob,
			String gender, String country) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirm() {
		return confirm;
	}

	public String getPhone() {
		return phone;
	}

	public String getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "RegisterModel [name=" + name + ", email=" + email + ", password=" + password + ", confirm=" + confirm
				+ ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + ", country=" + country + "]";
	}
	
	
	
	
	
}
