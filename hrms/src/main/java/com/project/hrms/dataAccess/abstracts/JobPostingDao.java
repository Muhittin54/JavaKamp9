package com.project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.hrms.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
	JobPosting getById(int id);

	List<JobPosting> getByStatus(boolean status);

	List<JobPosting> getByStatusOrderByReleaseDateDesc(boolean status);

	@Query("Select new com.project.hrms.entities.dtos.EmployerWithJobPostingDto(e.id, e.companyName, "
			+ "j.jobPosition, j.numberOfPosition, j.releaseDate, j.applicationDeadline) From Employer e "
			+ "inner join e.jobPostings as j Where j.status = :status and e.companyName = :companyName")
	List<JobPosting> getByStatusAndCompanyName(boolean status, String companyName);

	@Modifying
	@Query("update job_postings set status = :status where id = :id")
	int updateJobPostingStatus(boolean status, int id);

	List<JobPosting> getByEmployer(int employerId);
}
