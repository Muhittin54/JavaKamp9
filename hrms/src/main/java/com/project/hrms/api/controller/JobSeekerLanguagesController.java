package com.project.hrms.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerLanguageService;
import com.project.hrms.entities.concretes.JobSeekerLanguage;

@RestController
@RequestMapping("/api/languages")
public class JobSeekerLanguagesController {
	private JobSeekerLanguageService jobSeekerLanguageService;
	
	@Autowired
	public JobSeekerLanguagesController(JobSeekerLanguageService jobSeekerLanguageService) {
		this.jobSeekerLanguageService = jobSeekerLanguageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerLanguage jobSeekerLanguage) {
		return ResponseEntity.ok(this.jobSeekerLanguageService.add(jobSeekerLanguage));
	}
}