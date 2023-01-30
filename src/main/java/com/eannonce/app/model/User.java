package com.eannonce.app.model;

import java.time.Instant;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String photo;
	private String firstName;
	private String lastName;
	private String username;
	
	//@DateTimeFormat(pattern = "dd/mm/yyyy")
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat
	//private Date dtBirth;	
	//private Instant dtBirth;
	
	private String email;
	private String password;
	private String contact;
	private String address;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String photo, String firstName, String lastName, String username, String email,
			String password, String contact, String address) {
		super();
		this.photo = photo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		//this.dtBirth = dtBirth;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.address = address;
	}
	
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
//	public Instant getDtBirth() {
//		return dtBirth;
//	}
//	public void setDtBirth(Instant dtBirth) {
//		this.dtBirth = dtBirth;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", photo=" + photo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", username=" + username + ", email=" + email + ", password=" + password
				+ ", contact=" + contact + ", address=" + address + "]";
	}
	
}
