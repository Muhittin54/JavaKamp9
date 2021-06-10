package com.project.hrms.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerSummaryService;
import com.project.hrms.entities.concretes.JobSeekerSummary;

@RestController
@RequestMapping("/api/summaries")
public class JobSeekerSummariesController {

	private JobSeekerSummaryService jobSeekerSummaryService;

	@Autowired
	public JobSeekerSummariesController(JobSeekerSummaryService jobSeekerSummaryService) {
		this.jobSeekerSummaryService = jobSeekerSummaryService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerSummary jobSeekerSummary) {
		return ResponseEntity.ok(this.jobSeekerSummaryService.add(jobSeekerSummary));
	}
}
