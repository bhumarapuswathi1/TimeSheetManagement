package com.TimeSheet.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TimeSheet.Model.ProjectManager;



@Service
public interface IProjectManagerService  {
	public ProjectManager addProject(ProjectManager projectManager);
	public List<ProjectManager> findAllProject();
	public Optional<ProjectManager> findByProjectId(int proj_id);
	public void delete(ProjectManager project);

}
