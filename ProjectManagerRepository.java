package com.TimeSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TimeSheet.Model.ProjectManager;



public interface ProjectManagerRepository extends JpaRepository<ProjectManager,Integer> {

	/*
	 * @Query("select proj_name ProjectManager ") List<ProjectManager>
	 * findByproj_name(String pnm);
	 */

	

}


