package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.project.MilestoneHistory;
import org.hisp.pmt.api.project.Milestone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilestoneHistoryRepository extends JpaRepository<MilestoneHistory, Integer>
{
    //*******************************************************************************
    //Find MilestoneHistory by id
    //*******************************************************************************   
    MilestoneHistory findMilestoneHistoryById(Integer id);
    
    //*******************************************************************************
    //Find All
    //*******************************************************************************   
    List<MilestoneHistory> findAll();
    
    //*******************************************************************************
    //Find MilestoneHistory by milestone
    //*******************************************************************************   
   MilestoneHistory findMilestoneHistoryByMilestone(Milestone milestone);
    
}
