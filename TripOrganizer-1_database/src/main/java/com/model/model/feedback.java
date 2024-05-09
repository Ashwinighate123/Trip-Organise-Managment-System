package com.model.model;

import javax.persistence.*;

@Entity
@Table(name="feedback")

public class feedback {

@Id
@Column(name="ID")
private int id;

@Column(name="NAME")
 private String name;
@Column(name="EMAIL_ADDRESS")
private String email_address;

@Column(name="PHONE_NUMBER")
private int  phone_number;
	
@Column(name="COMET")
private String comet;

public feedback() {
	super();
	// TODO Auto-generated constructor stub
}

public feedback(int id, String name, String email_address, int phone_number, String comet) {
	super();
	this.id = id;
	this.name = name;
	this.email_address = email_address;
	this.phone_number = phone_number;
	this.comet = comet;
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

public String getEmail_address() {
	return email_address;
}

public void setEmail_address(String email_address) {
	this.email_address = email_address;
}

public int getPhone_number() {
	return phone_number;
}

public void setPhone_number(int phone_number) {
	this.phone_number = phone_number;
}

public String getComet() {
	return comet;
}

public void setComet(String comet) {
	this.comet = comet;
}

@Override
public String toString() {
	return "feedback [id=" + id + ", name=" + name + ", email_address=" + email_address + ", phone_number="
			+ phone_number + ", comet=" + comet + "]";
}






}