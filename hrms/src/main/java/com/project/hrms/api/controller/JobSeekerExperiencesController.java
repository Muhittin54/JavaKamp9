package com.project.hrms.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerExperienceService;
import com.project.hrms.entities.concretes.JobSeekerExperience;


@RestController
@RequestMapping("/api/experiences")
public class JobSeekerExperiencesController {
	private JobSeekerExperienceService jobSeekerExperienceService;

	@Autowired
	public JobSeekerExperiencesController(JobSeekerExperienceService jobSeekerExperienceService) {
		this.jobSeekerExperienceService = jobSeekerExperienceService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerExperience jobSeekerExperience) {
		return ResponseEntity.ok(this.jobSeekerExperienceService.add(jobSeekerExperience));
	}
}
