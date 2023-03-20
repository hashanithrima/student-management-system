package com.example.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "course_name")
	private String coursename;
	
	@Column(name = "contact_number")
	private String contactnumber;
	
	@Column(name = "gender")
	private Boolean gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "registration_number")
	private String registrationnumber;
	
	@Column(name = "notes")
	private String notes;
	
	public String getRegistrationnumber() {
		return registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {

	}

	public Student(String firstName, String lastName, String email, String courseName, String contactNumber, Boolean gender, String address, String registrationNumber, String notes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.coursename = courseName;
		this.contactnumber = contactNumber;
		this.gender = gender;
		this.registrationnumber = registrationNumber;
		this.notes = notes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}