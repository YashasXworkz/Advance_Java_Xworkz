package com.xworkz.passport.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "passport_info")
@NoArgsConstructor
@NamedQueries({ @NamedQuery(name = "updateByEmail", query = "SELECT p FROM PassportEntity p WHERE p.email = :email"),
		@NamedQuery(name = "findById", query = "SELECT p FROM PassportEntity p WHERE p.id = :id"),
		@NamedQuery(name = "findAll", query = "SELECT p FROM PassportEntity p"),
		@NamedQuery(name = "findByEmail", query = "SELECT p FROM PassportEntity p WHERE p.email = :email"),
		@NamedQuery(name = "findByPhone", query = "SELECT p FROM PassportEntity p WHERE p.phoneNo = :phNo"),
		@NamedQuery(name = "countAll", query = "SELECT COUNT(p) FROM PassportEntity p") })
public class PassportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Date dob;
	@Column(name = "phone_no")
	private Long phoneNo;
	private String password;
	@Column(name = "confirm_password")
	private String confirmPassword;
	@Column(name = "aadhaar_no")
	private Long aadhaarNo;
	@Column(name = "passport_office")
	private String passportOffice;
}
