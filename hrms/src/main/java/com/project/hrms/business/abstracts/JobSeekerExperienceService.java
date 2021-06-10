package com.project.hrms.business.abstracts;

import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceService {
	Result add(JobSeekerExperience jobSeekerExperience);
}