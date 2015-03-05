package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.project.Milestone;
import org.hisp.pmt.api.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilestoneRepository
    extends JpaRepository<Milestone, Integer>
{
    // ******************************************************************************
    // Find BY :: Milestones by status
    // ******************************************************************************
    /**
     * 
     * @param status
     * @return List of milestones with a given status
     */
    List<Milestone> findMilestonesByStatus( String status );
    
    
    // ******************************************************************************
    // Find BY :: Milestone by name
    // ******************************************************************************
    /**
     * 
     * @param status
     * @return A milestones with a given name
     */
    Milestone findMilestoneByName( String name );
    
    // ******************************************************************************
    // Find BY :: Milestone by name
    // ******************************************************************************
    /**
     * 
     * @param Id
     * @return A milestones with a given Id
     */
    Milestone findMilestoneById( Integer Id );
    
    // ******************************************************************************
    // Find BY :: Milestones by project
    // ******************************************************************************
    /**
     * 
     * @param Project
     * @return A milestones for given project
     */
    List<Milestone> findMilestonesByProject( Project project );
    
    
    
    
}
