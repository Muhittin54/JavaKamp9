package com.project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.JobSeekerResumeService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.SuccessDataResult;
import com.project.hrms.dataAccess.abstracts.JobSeekerResumeDao;
import com.project.hrms.entities.dtos.JobSeekerResumeDto;

@Service
public class JobSeekerResumeManager implements JobSeekerResumeService{

	private JobSeekerResumeDao jobSeekerResumeDao;
	
	@Autowired
	public JobSeekerResumeManager(JobSeekerResumeDao jobSeekerResumeDao) {
		this.jobSeekerResumeDao = jobSeekerResumeDao;
	}
	
	@Override
	public DataResult<List<JobSeekerResumeDto>> getJobSeekerResumeDetails(int jobSeekerId) {
		return new SuccessDataResult<List<JobSeekerResumeDto>>
		(this.jobSeekerResumeDao.getJobSeekerResumeDetails(jobSeekerId), "Kisi ozgecmisi getirildi.");
	}
}