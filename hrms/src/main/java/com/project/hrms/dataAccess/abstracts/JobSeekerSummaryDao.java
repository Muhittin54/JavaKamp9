package com.project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hrms.entities.concretes.JobSeekerSummary;

public interface JobSeekerSummaryDao extends JpaRepository<JobSeekerSummary, Integer>{

}
