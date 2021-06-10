package com.project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrms.business.abstracts.JobSeekerSchoolService;
import com.project.hrms.core.utilities.results.DataResult;
import com.project.hrms.core.utilities.results.Result;
import com.project.hrms.core.utilities.results.SuccessDataResult;
import com.project.hrms.core.utilities.results.SuccessResult;
import com.project.hrms.dataAccess.abstracts.JobSeekerSchoolDao;
import com.project.hrms.entities.concretes.JobSeekerSchool;
import com.project.hrms.entities.dtos.JobSeekerWithSchoolDto;

@Service
public class JobSeekerSchoolManager implements JobSeekerSchoolService {

	private JobSeekerSchoolDao jobSeekerSchoolDao;
	
	@Autowired
	public JobSeekerSchoolManager(JobSeekerSchoolDao jobSeekerSchoolDao) {
		this.jobSeekerSchoolDao = jobSeekerSchoolDao;
	}
	@Override
	public Result add(JobSeekerSchool jobSeekerSchool) {
		this.jobSeekerSchoolDao.save(jobSeekerSchool);
		return new SuccessResult("Okul Bilgisi Eklendi");
	}

	@Override
	public DataResult<List<JobSeekerWithSchoolDto>> getJobSeekerWithSchoolDetailsSorted() {
		return new SuccessDataResult<List<JobSeekerWithSchoolDto>>
		(this.jobSeekerSchoolDao.getJobSeekerWithSchoolDetailsSorted(), "Mezuniyet tarihini gore listelendi.");
	}

}
