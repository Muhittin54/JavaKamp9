package com.project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.hrms.entities.concretes.JobSeekerSchool;
import com.project.hrms.entities.dtos.JobSeekerWithSchoolDto;

public interface JobSeekerSchoolDao extends JpaRepository<JobSeekerSchool, Integer>{
	//Mezuniyet Yilina gore siralama
	@Query("Select new com.project.hrms.entities.dtos.JobSeekerWithSchoolDto(e.id, e.name, e.surName, s.schoolName, s.startDate, s.endDate) From JobSeeker e inner join e.schools Order By s.endDate Desc")
	List<JobSeekerWithSchoolDto> getJobSeekerWithSchoolDetailsSorted();
}
