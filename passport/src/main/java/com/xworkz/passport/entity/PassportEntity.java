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
		@NamedQuery(name = "findByPhone", query = "SELECT p FROM PassportEntity p WHERE p.phoneNo = :phNo") })
public class PassportEntity {
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_dob")
	private Date dob;
	@Column(name = "p_email")
	private String email;
	@Column(name = "p_phoneNo")
	private Long phoneNo;
	@Column(name = "p_password")
	private String password;
	@Column(name = "p_confirm_password")
	private String confirmPassword;
	@Column(name = "p_passport_office")
	private String passportOffice;
	@Column(name = "p_aadhaarNo")
	private Long aadhaarNo;
}
