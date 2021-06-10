package com.project.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_schools")
public class JobSeekerSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private JobSeeker jobSeeker;
	
	@Column(name = "school_date")
	@NotBlank
	@NotNull
	private String schoolName;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
}
