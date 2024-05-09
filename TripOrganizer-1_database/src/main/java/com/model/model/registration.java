package com.model.model;

import javax.persistence.*;

@Entity
@Table(name="registration")

public class registration {
@Id
@GeneratedValue
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="Birthdate")
private String birthdate;
@Column(name="email")
private String email ;
@Column(name="phone_number")
private String phone_number ;
@Column(name="address")
private String address ;
@Column(name="alternate_number")
private String alternate_number ;
@Column(name="password")
private String password;
public registration() {
	super();
	// TODO Auto-generated constructor stub
}
public registration(int id, String name, String birthdate, String email, String phone_number, String address,
		String alternate_number, String password) {
	super();
	this.id = id;
	this.name = name;
	this.birthdate = birthdate;
	this.email = email;
	this.phone_number = phone_number;
	this.address = address;
	this.alternate_number = alternate_number;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirthdate() {
	return birthdate;
}
public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAlternate_number() {
	return alternate_number;
}
public void setAlternate_number(String alternate_number) {
	this.alternate_number = alternate_number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "registration [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", email=" + email
			+ ", phone_number=" + phone_number + ", address=" + address + ", alternate_number=" + alternate_number
			+ ", password=" + password + "]";
}




}	


