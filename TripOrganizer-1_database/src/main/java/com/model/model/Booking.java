package com.model.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="booking")
	public class Booking {
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="Birthdate")
		private String birthdate;
		@Column(name="address")
		private String address ;
		@Column(name="email")
		private String email ;
		@Column(name="phone_number")
		private String phone_number ;
		@Column(name="alternate_number")
		private String alternate_number ;
		@Column(name="aadharcard_no")
		private String aadharcard_no ;
		@Column(name="pancard_no")
		private String pancard_no;
		
		
		@Column(name="destination")
		private String destination;
		@Column(name="hotelcategory")
		private String hotelcategory;
		@Column(name="noofdays")
		private String noofdays;
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Booking(int id, String name, String birthdate, String address, String email, String phone_number,
				String alternate_number, String aadharcard_no, String pancard_no, String destination,
				String hotelcategory, String noofdays) {
			super();
			this.id = id;
			this.name = name;
			this.birthdate = birthdate;
			this.address = address;
			this.email = email;
			this.phone_number = phone_number;
			this.alternate_number = alternate_number;
			this.aadharcard_no = aadharcard_no;
			this.pancard_no = pancard_no;
			this.destination = destination;
			this.hotelcategory = hotelcategory;
			this.noofdays = noofdays;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public String getAlternate_number() {
			return alternate_number;
		}
		public void setAlternate_number(String alternate_number) {
			this.alternate_number = alternate_number;
		}
		public String getAadharcard_no() {
			return aadharcard_no;
		}
		public void setAadharcard_no(String aadharcard_no) {
			this.aadharcard_no = aadharcard_no;
		}
		public String getPancard_no() {
			return pancard_no;
		}
		public void setPancard_no(String pancard_no) {
			this.pancard_no = pancard_no;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getHotelcategory() {
			return hotelcategory;
		}
		public void setHotelcategory(String hotelcategory) {
			this.hotelcategory = hotelcategory;
		}
		public String getNoofdays() {
			return noofdays;
		}
		public void setNoofdays(String noofdays) {
			this.noofdays = noofdays;
		}
		@Override
		public String toString() {
			return "Booking [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address
					+ ", email=" + email + ", phone_number=" + phone_number + ", alternate_number=" + alternate_number
					+ ", aadharcard_no=" + aadharcard_no + ", pancard_no=" + pancard_no + ", destination=" + destination
					+ ", hotelcategory=" + hotelcategory + ", noofdays=" + noofdays + "]";
		}
		
	}