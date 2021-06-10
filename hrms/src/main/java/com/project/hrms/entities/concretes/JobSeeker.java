package com.project.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "identification_number")
	@NotBlank
	@NotNull
	private String identificationNumber;
	
	@Column(name = "name")
	@NotBlank
	@NotNull
	private String name;
	
	@Column(name = "surname")
	@NotBlank
	@NotNull
	private String surName;
	
	@Column(name = "birthday")
	@NotBlank
	@NotNull
	private Date birthday;
	
	@Column(name = "email")
	@NotBlank
	@NotNull
	@Email
	private String email;
	
	@Column(name = "email_verification")
	private boolean emailVerification = false;
	
	@Column(name = "password")
	@NotBlank
	@NotNull
	private String password;
	
	@Column(name = "phone_number")
	@NotBlank
	@NotNull
	private String phoneNumber;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerWorkExperience> workExperiences;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerSchool> schools;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerExperience> experiences;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerLink> links;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerLanguage> languages;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerSummary> summaries;
}