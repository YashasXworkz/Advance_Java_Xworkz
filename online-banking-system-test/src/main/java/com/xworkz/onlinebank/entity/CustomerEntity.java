package com.xworkz.onlinebank.entity;

import java.time.LocalDate;

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
@NoArgsConstructor
@Entity
@Table(name = "cust_info")
@NamedQueries({ @NamedQuery(name = "findAll", query = "SELECT c FROM CustomerEntity c"),
		@NamedQuery(name = "findById", query = "SELECT c FROM CustomerEntity c WHERE c.id = :custId"),
		@NamedQuery(name = "findByAccountType", query = "SELECT c FROM CustomerEntity c WHERE c.accountType = :accType"),
		@NamedQuery(name = "findByOnlineBankingActive", query = "SELECT c FROM CustomerEntity c WHERE c.onlineBankingStatus = :isActive"),
		@NamedQuery(name = "updateDetailsByEmail", query = "SELECT c FROM CustomerEntity c WHERE c.email = :email") })
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private long contactNumber;
	private LocalDate dateOfBirth;
	private double annualIncome;
	private String address;
	private String qualification;
	private String bloodGroup;
	private long accountNumber;
	private String accountType;
	private String onlineBankingStatus;

	public CustomerEntity(String firstName, String lastName, String email, long contactNumber, LocalDate dateOfBirth,
			double annualIncome, String address, String qualification, String bloodGroup, long accountNumber, String accountType,
			String onlineBankingStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.annualIncome = annualIncome;
		this.address = address;
		this.qualification = qualification;
		this.bloodGroup = bloodGroup;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.onlineBankingStatus = onlineBankingStatus;
	}
}
