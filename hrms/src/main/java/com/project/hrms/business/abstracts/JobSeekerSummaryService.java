package com.project.hrms.business.abstracts;

import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.entities.concretes.JobSeekerSummary;

public interface JobSeekerSummaryService {
	Result add(JobSeekerSummary jobSeekerSummary);
}
