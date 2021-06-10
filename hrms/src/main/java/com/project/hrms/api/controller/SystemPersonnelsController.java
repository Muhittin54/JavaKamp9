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

import com.project.hrms.business.abstracts.SystemPersonnelService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/personnels")
public class SystemPersonnelsController {

	private SystemPersonnelService systemPersonnelService;

	@Autowired
	public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
		this.systemPersonnelService = systemPersonnelService;
	}

	@GetMapping("/getall")
	public DataResult<List<SystemPersonnel>> getAll() {
		return this.systemPersonnelService.getAll();
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody SystemPersonnel systemPersonnel) {
		return ResponseEntity.ok(this.systemPersonnelService.add(systemPersonnel));
	}
	
	@GetMapping("/getByEmail")
	public DataResult<SystemPersonnel> getByEmail(@RequestParam String email){
		return this.systemPersonnelService.getByEmail(email);
	}
	
	@GetMapping("/getByDeparmentId")
	public DataResult<List<SystemPersonnel>> getByDepartmentId(@RequestParam int id){
		return this.systemPersonnelService.getByDepartmentId(id);
	}
	
	@PutMapping("/staffApproval")
	public ResponseEntity<?> staffApproval(@RequestParam("isActive") boolean isActive, @RequestParam("id") int id) {
		return ResponseEntity.ok(this.systemPersonnelService.staffApproval(isActive, id));
	}
}
