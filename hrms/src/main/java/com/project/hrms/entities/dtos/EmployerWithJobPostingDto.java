package com.project.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployerWithJobPostingDto {
	private int id;
	private String companyName;
	private String jobPosition;
	private String numberOfPosition;
	private Date releaseDate;
	private Date applicationDeadline;
	private boolean status;
}
