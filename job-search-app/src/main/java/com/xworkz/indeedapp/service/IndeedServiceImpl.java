package com.xworkz.indeedapp.service;

import com.xworkz.indeedapp.dto.*;
import com.xworkz.indeedapp.repository.*;
import lombok.*;

@AllArgsConstructor
public class IndeedServiceImpl implements IndeedService {
  private IndeedRepository indeedRepository;
  
  public boolean validateJobAndAdd(IndeedDTO indDTO) {
    boolean isVerified = true;
    
    if (indDTO != null) {
      if (indDTO.getJobId() != 0) {
      } else {
        System.out.println("Job Id is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobTitle() != null && !indDTO.getJobTitle().isEmpty()) {
      } else {
        System.out.println("Job Title is invalid");
        isVerified = false;
      }
      
      if (indDTO.getCompanyName() != null && !indDTO.getCompanyName().isEmpty()) {
      } else {
        System.out.println("Company Name is invalid");
        isVerified = false;
      }
      
      if (indDTO.getCompanySize() != 0) {
      } else {
        System.out.println("Company Size is invalid");
        isVerified = false;
      }
      
      if (indDTO.getCompanyCity() != null && !indDTO.getCompanyCity().isEmpty()) {
      } else {
        System.out.println("Company City is invalid");
        isVerified = false;
      }
      
      if (indDTO.getCompanyState() != null && !indDTO.getCompanyState().isEmpty()) {
      } else {
        System.out.println("Company State is invalid");
        isVerified = false;
      }
      
      if (indDTO.getCompanyWebsite() != null && !indDTO.getCompanyWebsite().isEmpty()) {
      } else {
        System.out.println("Company Website is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobDescription() != null && !indDTO.getJobDescription().isEmpty()) {
      } else {
        System.out.println("Job Description is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobType() != null && !indDTO.getJobType().isEmpty()) {
      } else {
        System.out.println("Job Type is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobCategory() != null && !indDTO.getJobCategory().isEmpty()) {
      } else {
        System.out.println("Job Category is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobUrl() != null && !indDTO.getJobUrl().isEmpty()) {
      } else {
        System.out.println("Job URL is invalid");
        isVerified = false;
      }
      
      if (indDTO.getSalary() != 0) {
      } else {
        System.out.println("Salary is invalid");
        isVerified = false;
      }
      
      if (indDTO.getExperienceLevel() != null && !indDTO.getExperienceLevel().isEmpty()) {
      } else {
        System.out.println("Experience Level is invalid");
        isVerified = false;
      }
      
      if (indDTO.getEducationLevel() != null && !indDTO.getEducationLevel().isEmpty()) {
      } else {
        System.out.println("Education Level is invalid");
        isVerified = false;
      }
      
      if (indDTO.getRequiredSkills() != null && !indDTO.getRequiredSkills().isEmpty()) {
      } else {
        System.out.println("Required Skills are invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobBenefits() != null && !indDTO.getJobBenefits().isEmpty()) {
      } else {
        System.out.println("Job Benefits are invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobPostedDate() != null) {
      } else {
        System.out.println("Job Posted Date is invalid");
        isVerified = false;
      }
      
      if (indDTO.getJobExpiryDate() != null) {
      } else {
        System.out.println("Job Expiry Date is invalid");
        isVerified = false;
      }
      
      if (indDTO.getContactNumber() != 0) {
      } else {
        System.out.println("Contact Number is invalid");
        isVerified = false;
      }
      
      if (indDTO.getContactEmail() != null && !indDTO.getContactEmail().isEmpty()) {
      } else {
        System.out.println("Contact Email is invalid");
        isVerified = false;
      }
      
      if (indDTO.getUserId() != 0) {
      } else {
        System.out.println("User Id is invalid");
        isVerified = false;
      }
      
      if (indDTO.getUserName() != null && !indDTO.getUserName().isEmpty()) {
      } else {
        System.out.println("User Name is invalid");
        isVerified = false;
      }
      
      if (indDTO.getUserPhoneNumber() != 0) {
      } else {
        System.out.println("User Phone Number is invalid");
        isVerified = false;
      }
      
      if (indDTO.getUserEmailId() != null && !indDTO.getUserEmailId().isEmpty()) {
      } else {
        System.out.println("User Email Id is invalid");
        isVerified = false;
      }
      
      if (indDTO.getUserPassword() != null && !indDTO.getUserPassword().isEmpty()) {
      } else {
        System.out.println("User Password is invalid");
        isVerified = false;
      }
    } else {
      System.out.println("Invalid IndeedDTO object");
      isVerified = false;
    }
    
    if (isVerified) {
      indeedRepository.addJob(indDTO);
      System.out.println(indDTO);
      return true;
    } else {
      System.out.println("One of the condition is not valid. so can't proceed to add");
      return false;
    }
  }
}
