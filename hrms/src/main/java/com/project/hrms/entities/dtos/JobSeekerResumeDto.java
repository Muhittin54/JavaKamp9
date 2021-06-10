package com.project.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerResumeDto {
	private int id;
	private String name;
	private String surName;
	private String summary;
	private String schoolName;
	private Date schoolStartDate;
	private Date schoolEndDate;
	private String experience;
	private String workplace;
	private String position;
	private Date jobStartDate;
	private Date jobEndDate;
	private String language;
	private String level;
	private String github;
	private String linkedin;
}
