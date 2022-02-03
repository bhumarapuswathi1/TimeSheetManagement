package com.TimeSheet.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.Model.ProjectManager;
import com.TimeSheet.Repository.ProjectManagerRepository;


@Service
public class ProjectManagerService {
	@Autowired
	ProjectManagerRepository repo;
	public ProjectManager addProject(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		ProjectManager pm = repo.save(projectManager);
		
		return pm;
	}

		
	


	public List<ProjectManager> findAllProject() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public Optional<ProjectManager> findByProjectId(int proj_id) {
		// TODO Auto-generated method stub
		return repo.findById(proj_id);
	}

	public void delete(ProjectManager project) {
		// TODO Auto-generated method stub
		repo.delete(project);
		
	}

	/*
	 * public List<ProjectManager> findByproj_name(String pnm) { // TODO
	 * Auto-generated method stub List<ProjectManager> pm=repo.findByproj_name(pnm);
	 * return pm;
	 * 
	 * }
	 */
	



}





