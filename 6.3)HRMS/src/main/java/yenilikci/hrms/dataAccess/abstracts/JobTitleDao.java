package yenilikci.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import yenilikci.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
