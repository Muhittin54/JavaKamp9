package com.project.hrms.business.abstracts;

import java.util.List;

import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeekerSchool;
import com.project.hrms.entities.dtos.JobSeekerWithSchoolDto;

public interface JobSeekerSchoolService {
	Result add(JobSeekerSchool jobSeekerSchool);
	DataResult<List<JobSeekerWithSchoolDto>> getJobSeekerWithSchoolDetailsSorted();
}
