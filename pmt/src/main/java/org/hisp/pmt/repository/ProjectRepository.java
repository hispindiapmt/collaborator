package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository
    extends JpaRepository<Project, Integer>
{

    // ******************************************************************************
    // Find BY :: Project ID ,Project name and Project type
    // ******************************************************************************

    /**
     * 
     * @param Exact id of a project
     * @return A project with given id
     */
    Project findProjectById( int id );

    /**
     * 
     * @param type
     * @return List of projects with given type
     */
    List<Project> findProjectsByType( String type );

    

}
