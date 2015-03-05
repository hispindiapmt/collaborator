package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.project.Activity;
import org.hisp.pmt.api.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository
    extends JpaRepository<Activity, Integer>
{
    /**
     * 
     * @param Integer id
     * @return Activity with given id
     */
    // ******************************************************************************
    // Find BY :: Activity by ID
    // ******************************************************************************
    Activity findActivityById( Integer id );

    /**
     * 
     * @param String status
     * @return List of Activities with given status
     */
    // ******************************************************************************
    // Find BY :: Activities by status
    // ******************************************************************************
    List<Activity> findActivitiesByStatus( String status );
    
    
    /**
     * 
     * @param Project project
     * @return List of activities for a given project
     */
    // ******************************************************************************
    // Find BY :: Activities by project
    // ******************************************************************************
    List<Activity> findActivitiesByProject( Project project );
    
    /**
     * 
     * @param String type
     * @return List of Activities for a given type
     */

    // ******************************************************************************
    // Find BY :: Activities by type
    // ******************************************************************************
    List<Activity> findActivitiesByType( String type );
    
    
    /**
     * 
     * @param String rating
     * @return List of Activities for a given rating 
     */
    // ******************************************************************************
    // Find BY :: Activities by rating
    // ******************************************************************************
    List<Activity> findActivitiesByRating( String rating );

}
