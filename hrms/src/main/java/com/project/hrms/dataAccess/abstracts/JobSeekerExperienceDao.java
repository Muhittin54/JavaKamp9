package com.project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hrms.entities.concretes.JobSeekerExperience;

public interface JobSeekerExperienceDao extends JpaRepository<JobSeekerExperience, Integer> {

}