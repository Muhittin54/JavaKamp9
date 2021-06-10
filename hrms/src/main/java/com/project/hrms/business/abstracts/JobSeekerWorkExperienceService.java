package com.project.hrms.business.abstracts;

import java.util.List;

import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeekerWorkExperience;
import com.project.hrms.entities.dtos.JobSeekerWithWorkExperienceDto;

public interface JobSeekerWorkExperienceService {

	Result add(JobSeekerWorkExperience jobSeekerWorkExperience);
	
	DataResult<List<JobSeekerWithWorkExperienceDto>> getJobSeekerWithWorkExperienceDetailsSorted();
}
