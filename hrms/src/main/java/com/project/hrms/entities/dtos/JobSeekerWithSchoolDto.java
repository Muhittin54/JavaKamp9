package com.project.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobSeekerWithSchoolDto {
	private int id;
	private String name;
	private String surName;
	private String schoolName;
	private Date startDate;
	private Date endDate;
}
