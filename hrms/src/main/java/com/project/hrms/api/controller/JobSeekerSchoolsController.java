package com.project.hrms.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerSchoolService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.concretes.JobSeekerSchool;
import com.project.hrms.entities.dtos.JobSeekerWithSchoolDto;

@RestController
@RequestMapping("/api/schools")
public class JobSeekerSchoolsController {
	private JobSeekerSchoolService jobSeekerSchoolService;
	
	@Autowired
	public JobSeekerSchoolsController(JobSeekerSchoolService jobSeekerSchoolService) {
		this.jobSeekerSchoolService = jobSeekerSchoolService;
	}
	
	@GetMapping("/getJobSeekerWithSchoolDetailsSorted")
	public DataResult<List<JobSeekerWithSchoolDto>> getJobSeekerWithSchoolDetailsSorted(){
		return this.jobSeekerSchoolService.getJobSeekerWithSchoolDetailsSorted();
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerSchool jobSeekerSchool) {
		return ResponseEntity.ok(this.jobSeekerSchoolService.add(jobSeekerSchool));
	}
}
