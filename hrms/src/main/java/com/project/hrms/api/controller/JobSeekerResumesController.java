package com.project.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobSeekerResumeService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.dtos.JobSeekerResumeDto;

@RestController
@RequestMapping("/api/resume")
public class JobSeekerResumesController {

	private JobSeekerResumeService jobSeekerResumeService;

	@Autowired
	public JobSeekerResumesController(JobSeekerResumeService jobSeekerResumeService) {
		this.jobSeekerResumeService = jobSeekerResumeService;
	}

	@GetMapping("/getJobSeekerResumeDetails")
	public DataResult<List<JobSeekerResumeDto>> getJobSeekerResumeDetails(@RequestParam int jobSeekerId) {
		return this.jobSeekerResumeService.getJobSeekerResumeDetails(jobSeekerId);
	}
}
