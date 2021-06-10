package com.project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.JobSeekerWorkExperienceService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.core.utilities.results.SuccessDataResult;
import com.project.hrms.core.utilities.results.SuccessResult;
import com.project.hrms.dataAccess.abstracts.JobSeekerWorkExperienceDao;
import com.project.hrms.entities.concretes.JobSeekerWorkExperience;
import com.project.hrms.entities.dtos.JobSeekerWithWorkExperienceDto;

@Service
public class JobSeekerWorkExperienceManager implements JobSeekerWorkExperienceService{

	private JobSeekerWorkExperienceDao jobSeekerWorkExperienceDao;
	
	@Autowired
	public JobSeekerWorkExperienceManager(JobSeekerWorkExperienceDao jobSeekerWorkExperienceDao) {
		this.jobSeekerWorkExperienceDao = jobSeekerWorkExperienceDao;
	}
	
	@Override
	public Result add(JobSeekerWorkExperience jobSeekerWorkExperience) {
		this.jobSeekerWorkExperienceDao.save(jobSeekerWorkExperience);
		return new SuccessResult("Is deneyimi basariyla eklendi.");
	}

	@Override
	public DataResult<List<JobSeekerWithWorkExperienceDto>> getJobSeekerWithWorkExperienceDetailsSorted() {
		return new SuccessDataResult<List<JobSeekerWithWorkExperienceDto>>
		(this.jobSeekerWorkExperienceDao.getJobSeekerWithWorkExperienceDetailsSorted(), "Is tecrubeleri yıla gore listelendi.");
	}

}
