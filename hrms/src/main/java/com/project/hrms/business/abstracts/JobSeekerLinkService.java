package com.project.hrms.business.abstracts;

import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeekerLink;

public interface JobSeekerLinkService {
	Result add(JobSeekerLink jobSeekerLink);
}
