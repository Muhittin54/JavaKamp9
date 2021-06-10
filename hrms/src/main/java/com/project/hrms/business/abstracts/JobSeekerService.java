package com.project.hrms.business.abstracts;

import java.util.List;

import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();

	Result add(JobSeeker jobSeeker);
	
	DataResult<JobSeeker> getByIdentificationNumber(String identificationNumber);

	DataResult<JobSeeker> getByEmail(String email);

	DataResult<JobSeeker> getById(int id);
	
	DataResult<List<JobSeeker>> getByName(String name);
}
