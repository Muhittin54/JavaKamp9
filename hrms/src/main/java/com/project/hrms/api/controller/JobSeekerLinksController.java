package com.project.hrms.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerLinkService;
import com.project.hrms.entities.concretes.JobSeekerLink;

@RestController
@RequestMapping("/api/links")
public class JobSeekerLinksController {
	private JobSeekerLinkService jobSeekerLinkService;
	
	@Autowired
	public JobSeekerLinksController(JobSeekerLinkService jobSeekerLinkService) {
		this.jobSeekerLinkService = jobSeekerLinkService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerLink jobSeekerLink) {
		return ResponseEntity.ok(this.jobSeekerLinkService.add(jobSeekerLink));
	}
}
