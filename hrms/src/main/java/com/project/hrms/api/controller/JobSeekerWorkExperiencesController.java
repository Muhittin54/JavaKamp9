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

import com.project.hrms.business.abstracts.JobSeekerWorkExperienceService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.concretes.JobSeekerWorkExperience;
import com.project.hrms.entities.dtos.JobSeekerWithWorkExperienceDto;

@RestController
@RequestMapping("/api/workexperiences")
public class JobSeekerWorkExperiencesController {

	private JobSeekerWorkExperienceService jobSeekerWorkExperienceService;

	@Autowired
	public JobSeekerWorkExperiencesController(JobSeekerWorkExperienceService jobSeekerWorkExperienceService) {
		this.jobSeekerWorkExperienceService = jobSeekerWorkExperienceService;
	}

	@GetMapping("/getJobSeekerWithWorkExperienceDetailsSorted")
	public DataResult<List<JobSeekerWithWorkExperienceDto>> getJobSeekerWithWorkExperienceDetailsSorted() {
		return this.jobSeekerWorkExperienceService.getJobSeekerWithWorkExperienceDetailsSorted();
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerWorkExperience jobSeekerWorkExperience) {
		return ResponseEntity.ok(this.jobSeekerWorkExperienceService.add(jobSeekerWorkExperience));
	}
}
