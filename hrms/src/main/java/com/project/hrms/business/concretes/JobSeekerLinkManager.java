package com.project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.JobSeekerLinkService;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.core.utilities.results.SuccessResult;
import com.project.hrms.dataAccess.abstracts.JobSeekerLinkDao;
import com.project.hrms.entities.concretes.JobSeekerLink;

@Service
public class JobSeekerLinkManager implements JobSeekerLinkService{
	
	private JobSeekerLinkDao jobSeekerLinkDao;
	
	@Autowired
	public JobSeekerLinkManager(JobSeekerLinkDao jobSeekerLinkDao) {
		this.jobSeekerLinkDao = jobSeekerLinkDao;
	}
	
	@Override
	public Result add(JobSeekerLink jobSeekerLink) {
		this.jobSeekerLinkDao.save(jobSeekerLink);
		return new SuccessResult("Sosyal medya likleri eklendi");
	}

}
