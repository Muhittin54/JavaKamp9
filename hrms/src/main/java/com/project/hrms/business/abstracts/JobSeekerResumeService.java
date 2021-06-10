package com.project.hrms.business.abstracts;

import java.util.List;

import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.entities.dtos.JobSeekerResumeDto;

public interface JobSeekerResumeService {
	DataResult<List<JobSeekerResumeDto>> getJobSeekerResumeDetails(int jobSeekerId);
}
