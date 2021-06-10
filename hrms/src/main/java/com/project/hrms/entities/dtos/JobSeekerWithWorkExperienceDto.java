package com.project.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerWithWorkExperienceDto {

	private int id;
	private String name;
	private String surName;
	private String workplace;
	private String position;
	private Date startDate;
	private Date endDate;
}
