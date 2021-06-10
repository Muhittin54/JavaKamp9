package com.project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.project.hrms.entities.dtos.JobSeekerResumeDto;

public interface JobSeekerResumeDao {

	//Is arayanlarin ozgecmislerinin tamaminin goruntulenmesi
	@Query("Select new com.project.hrms.entities.dtos.JobSeekerResumeDto(e.id, e.name, e.surName, s.summary, sc.schoolName, sc.schoolStartDate, sc.schoolEndDate, ex.experience, jex.workplace, "
			+ "jex.position, jex.jobStartDate, jex.jobEndDate, l.language, l.level, li.github, li.linkedin) From JobSeeker e Inner Join e.summaries s Inner Join e.schools sc Inner Join e.experiences ex Inner Join e.workExperiences jex "
			+ "Inner Join e.languages l Inner Join e.links li Where e.id = :jobSeekerId")
	List<JobSeekerResumeDto> getJobSeekerResumeDetails(int jobSeekerId);
}
