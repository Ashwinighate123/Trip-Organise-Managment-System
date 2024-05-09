package com.model.model;

import javax.persistence.*;

@Entity
@Table(name="contact")
public class contact {

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="YOUR_NAME")
	 private String name;
	@Column(name="EMAIL_ADDRESS")
	private String email_address;

	@Column(name="PHONE_NUMBER")
	private int  phone_number;
		
	@Column(name=" HOW_CAN_WE_HELP")
	private String  How_Can_We_Help;

	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public contact(int id, String name, String email_address, int phone_number, String how_Can_We_Help) {
		super();
		this.id = id;
		this.name = name;
		this.email_address = email_address;
		this.phone_number = phone_number;
		How_Can_We_Help = how_Can_We_Help;
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

	public String getHow_Can_We_Help() {
		return How_Can_We_Help;
	}

	public void setHow_Can_We_Help(String how_Can_We_Help) {
		How_Can_We_Help = how_Can_We_Help;
	}

	@Override
	public String toString() {
		return "contact [id=" + id + ", name=" + name + ", email_address=" + email_address + ", phone_number="
				+ phone_number + ", How_Can_We_Help=" + How_Can_We_Help + "]";
	}
	
	
}