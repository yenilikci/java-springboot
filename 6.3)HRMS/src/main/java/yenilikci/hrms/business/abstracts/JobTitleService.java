package yenilikci.hrms.business.abstracts;

import java.util.List;

import yenilikci.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
