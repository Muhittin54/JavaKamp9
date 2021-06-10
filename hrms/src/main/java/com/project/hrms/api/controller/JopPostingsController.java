package com.project.hrms.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrms.business.abstracts.JobPostingService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/postings")
public class JopPostingsController {
	private JobPostingService jobPostingService;

	@Autowired
	public JopPostingsController(JobPostingService jobPostingService) {
		this.jobPostingService = jobPostingService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		return this.jobPostingService.getAll();
	}
	
	@GetMapping("/getAllPageable")
	public DataResult<List<JobPosting>> getAll(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize){
		return this.jobPostingService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getalldesc")
	public DataResult<List<JobPosting>> getAllSorted(){
		return this.jobPostingService.getAllSorted();
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobPosting jobPosting) {
		return ResponseEntity.ok(this.jobPostingService.add(jobPosting));
	}

	@GetMapping("/getByStatus")
	public DataResult<List<JobPosting>> getByStatus(@RequestParam boolean status) {
		return this.jobPostingService.getByStatus(status);
	}

	@GetMapping("/getByStatusOrderByReleaseDateDesc")
	public DataResult<List<JobPosting>> getByStatusOrderByReleaseDateDesc(@RequestParam boolean status) {
		return this.jobPostingService.getByStatusOrderByReleaseDateDesc(status);
	}

	@GetMapping("/getByStatusAndCompanyName")
	public DataResult<List<JobPosting>> getBySatatusAndCompanyName(@RequestParam("status") boolean status, @RequestParam("companyName") String companyName) {
		return this.jobPostingService.getByStatusAndCompanyName(status, companyName);
	}

	@PutMapping("/updateJobPostingStatus")
	public ResponseEntity<?> updateJobPostingStatus(@RequestParam("status") boolean status, @RequestParam("id") int id) {
		return ResponseEntity.ok(this.updateJobPostingStatus(status, id));
	}
}
