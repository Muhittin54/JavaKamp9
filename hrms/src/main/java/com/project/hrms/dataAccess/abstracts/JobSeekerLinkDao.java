package com.project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hrms.entities.concretes.JobSeekerLink;

public interface JobSeekerLinkDao extends JpaRepository<JobSeekerLink, Integer>{

}
