package com.xworkz.indeedapp.dto;

import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
public class IndeedDTO {
  private int jobId;
  private String jobTitle;
  private String companyName;
  private int companySize;
  private String companyCity;
  private String companyState;
  private String companyWebsite;
  private String jobDescription;
  private String jobType;
  private String jobCategory;
  private String jobUrl;
  private int salary;
  private String experienceLevel;
  private String educationLevel;
  private String requiredSkills;
  private String jobBenefits;
  private Date jobPostedDate;
  private Date jobExpiryDate;
  private long contactNumber;
  private String contactEmail;
  private int userId;
  private String userName;
  private long userPhoneNumber;
  private String userEmailId;
  private String userPassword;
}
