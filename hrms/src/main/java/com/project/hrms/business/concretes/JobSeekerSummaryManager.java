package com.project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.JobSeekerSummaryService;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.core.utilities.results.SuccessResult;
import com.project.hrms.dataAccess.abstracts.JobSeekerSummaryDao;
import com.project.hrms.entities.concretes.JobSeekerSummary;

@Service
public class JobSeekerSummaryManager implements JobSeekerSummaryService{
	
	private JobSeekerSummaryDao jobSeekerSummaryDao;
	
	@Autowired
	public JobSeekerSummaryManager(JobSeekerSummaryDao jobSeekerSummaryDao) {
		this.jobSeekerSummaryDao = jobSeekerSummaryDao;
	}
	
	@Override
	public Result add(JobSeekerSummary jobSeekerSummary) {
		this.jobSeekerSummaryDao.save(jobSeekerSummary);
		return new SuccessResult("Özet bilgi basariyla eklendi.");
	}

}
