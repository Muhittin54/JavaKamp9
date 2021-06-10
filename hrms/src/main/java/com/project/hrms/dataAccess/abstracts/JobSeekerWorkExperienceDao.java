package com.project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.hrms.entities.concretes.JobSeekerWorkExperience;
import com.project.hrms.entities.dtos.JobSeekerWithWorkExperienceDto;

public interface JobSeekerWorkExperienceDao extends JpaRepository<JobSeekerWorkExperience, Integer> {

	//Is tecrubelerine gore siralama
	@Query("Select new com.project.hrms.entities.dtos.JobSeekerWithWorkExperienceDto(j.id, j.name, j.surName, w.workplace, w.position, w.startDate, w.endDate) From JobSeeker j Inner Join j.workExperiences w Order By w.endDate Desc")
	List<JobSeekerWithWorkExperienceDto> getJobSeekerWithWorkExperienceDetailsSorted();
}
