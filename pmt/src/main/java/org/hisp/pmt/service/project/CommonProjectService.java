package org.hisp.pmt.service.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hisp.pmt.api.project.Activity;
import org.hisp.pmt.api.project.Invoice;
import org.hisp.pmt.api.project.Member;
import org.hisp.pmt.api.project.MilestoneHistory;
import org.hisp.pmt.api.project.Milestone;
import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.api.user.UserRole;
import org.hisp.pmt.repository.ActivityRepository;
import org.hisp.pmt.repository.InvoiceRepository;
import org.hisp.pmt.repository.MemberRepository;
import org.hisp.pmt.repository.MilestoneHistoryRepository;
import org.hisp.pmt.repository.MilestoneRepository;
import org.hisp.pmt.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private MilestoneRepository milestoneRepository;

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private MilestoneHistoryRepository milestoneHistoryRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    /**
     * Project services
     * 
     */

    // **************************************************************************************
    // Find All projects
    // **************************************************************************************

    public List<Project> findAll()
    {
        return projectRepository.findAll();
    }

    // **************************************************************************************
    // Find project by Id
    // **************************************************************************************

    public Project findProjectById( Integer id )
    {
        Project project = projectRepository.findProjectById( id );
        return project;
    }

    // **************************************************************************************
    // Find projects by type
    // **************************************************************************************
    public List<Project> findProjectsByType( String type )
    {
        List<Project> projectList = new ArrayList<Project>( projectRepository.findProjectsByType( type ) );
        return projectList;
    }

    // ********************************************************************************
    // Add project
    // ********************************************************************************
    public void AddProject( Project project )
    {
        projectRepository.save( project );
    }

    // ********************************************************************************
    // Save project
    // ********************************************************************************
    public void saveProject( Project projectToBeSaved )
    {
        projectRepository.save( projectToBeSaved );
    }

    // ********************************************************************************
    // Delete project
    // ********************************************************************************
    public void deleteProject( Project project )
    {
        projectRepository.delete( project );
    }

    /**
     * Milestone services
     * 
     */
    // ******************************************************************************
    // Find BY :: Find Milestone by id
    // ******************************************************************************
    public Milestone findMilestoneById( Integer id )
    {
        Milestone milestone = milestoneRepository.findMilestoneById( id );
        return milestone;
    }

    // ******************************************************************************
    // Find BY :: Find Milestone by name
    // ******************************************************************************

    public Milestone findMilestoneByName( String name )
    {
        Milestone milestone = milestoneRepository.findMilestoneByName( name );
        return milestone;
    }

    // ******************************************************************************
    // Find BY :: Find Milestones by status
    // ******************************************************************************

    public List<Milestone> findMilestonesByStatus( String status )
    {
        List<Milestone> milestoneList = milestoneRepository.findMilestonesByStatus( status );
        return milestoneList;
    }

    // ******************************************************************************
    // Find BY :: Find Milestones by Project
    // ******************************************************************************

    public List<Milestone> findMilestonesByProject( Project project )
    {
        List<Milestone> milestoneList = milestoneRepository.findMilestonesByProject( project );
        return milestoneList;
    }

    // ******************************************************************************
    // Add milestone
    // ******************************************************************************
    public void addMilestone( Milestone milestone )
    {
        milestoneRepository.save( milestone );
    }

    public void addMilestoneToProject( Project correspondingProject, Milestone milestone )
    {
        milestone.setProject( correspondingProject );
        milestoneRepository.save( milestone );
    }

    // ******************************************************************************
    // Save milestone
    // ******************************************************************************
    public void saveMilestone( Milestone milestoneToBeSaved )
    {
        milestoneRepository.save( milestoneToBeSaved );
    }

    // ******************************************************************************
    // delete milestone
    // ******************************************************************************
    public void deleteMilestone( Milestone milestone )
    {
        milestoneRepository.delete( milestone );
    }

    /**
     * Activity services
     * 
     */
    // ******************************************************************************
    // Find BY :: Activity by ID
    // *****************************************************************************
    public Activity findActivityById( Integer id )
    {
        Activity activity = activityRepository.findActivityById( id );
        return activity;
    }

    // ******************************************************************************
    // Find all activities
    // *****************************************************************************
    public List<Activity> findAllActivities()
    {
        List<Activity> activityList = activityRepository.findAll();
        return activityList;
    }

    // ******************************************************************************
    // Find BY :: Activities by status
    // ******************************************************************************

    public List<Activity> findActivitiesByStatus( String status )
    {
        List<Activity> activityList = activityRepository.findActivitiesByStatus( status );
        return activityList;
    }

    // ******************************************************************************
    // Find BY :: Activities by project
    // ******************************************************************************
    public List<Activity> findActivitiesByProject( Project project )
    {
        List<Activity> activityList = activityRepository.findActivitiesByProject( project );
        return activityList;
    }

    // ******************************************************************************
    // Find BY :: Activities by type
    // ******************************************************************************
    List<Activity> findActivitiesByType( String type )
    {
        List<Activity> activityList = activityRepository.findActivitiesByType( type );
        return activityList;
    }

    // ******************************************************************************
    // Find BY :: Activities by rating
    // ******************************************************************************
    public List<Activity> findActivitiesByRating( String rating )
    {
        List<Activity> activityList = activityRepository.findActivitiesByRating( rating );
        return activityList;
    }

    // ******************************************************************************
    // Add Activity
    // ******************************************************************************
    public void addActivity( Activity activity )
    {
        activityRepository.save( activity );
    }

    public void addActivityToProject( Project correspondingProject, Activity addedActivity )
    {
        addedActivity.setProject( correspondingProject );
        activityRepository.save( addedActivity );
    }

    // ******************************************************************************
    // Update Activity
    // ******************************************************************************
    public void updateActivity( Activity activityToBeupdated )
    {
        activityRepository.save( activityToBeupdated );
    }

    // ******************************************************************************
    // Delete Activity
    // ******************************************************************************
    public void deleteActvity( Activity activity )
    {
        activityRepository.delete( activity );
    }

    /**
     * MileStoneHistory services
     */

    // ******************************************************************************
    // Find BY :: MilestoneHistory by id
    // ******************************************************************************
    public MilestoneHistory FindMileStoneHistoryById( Integer id )
    {
        MilestoneHistory milestoneHistory = milestoneHistoryRepository.findMilestoneHistoryById( id );
        return milestoneHistory;
    }

    // ******************************************************************************
    // Find All
    // ******************************************************************************

    public List<MilestoneHistory> findAllMilestoneHistory()
    {
        List<MilestoneHistory> milestoneHistoryList = milestoneHistoryRepository.findAll();
        return milestoneHistoryList;
    }

    // ******************************************************************************
    // Find BY :: MilestoneHistory by Milestone
    // ******************************************************************************
    public MilestoneHistory FindMileStoneHistoryByMilestone( Milestone milestone )
    {
        MilestoneHistory milestoneHistory = milestoneHistoryRepository.findMilestoneHistoryByMilestone( milestone );
        return milestoneHistory;
    }

    // ******************************************************************************
    // Add MilestoneHistory
    // ******************************************************************************
    public void addMilestoneHistory( MilestoneHistory milestoneHistory )
    {
        milestoneHistoryRepository.save( milestoneHistory );
    }

    // ******************************************************************************
    // Update MilestoneHistory
    // ******************************************************************************
    public void updateMilestoneHistory( MilestoneHistory milestoneHistoryToBeUpdated )
    {
        milestoneHistoryRepository.save( milestoneHistoryToBeUpdated );
    }

    // ******************************************************************************
    // Delete MilestoneHistory
    // ******************************************************************************
    public void deleteMilestoneHistory( MilestoneHistory milestoneHistory )
    {
        milestoneHistoryRepository.delete( milestoneHistory );
    }

    /**
     * Member services
     */

    // ******************************************************************************
    // Find BY ::Member by ID
    // ******************************************************************************
    public Member findMemberById( Integer id )
    {
        Member member = memberRepository.findMemberById( id );
        return member;
    }

    // ******************************************************************************
    // Find BY ::Members by Role
    // ******************************************************************************
    public List<Member> findMemberByRole( UserRole role )
    {
        List<Member> memberList = memberRepository.findMembersByRole( role );
        return memberList;
    }

    // ******************************************************************************
    // Find BY ::Members by Project
    // ******************************************************************************
    public List<Member> findMemberByProject( Project project )
    {
        List<Member> memberList = memberRepository.findMembersByProject( project );
        return memberList;
    }

    // ******************************************************************************
    // Find All Members
    // ******************************************************************************
    public List<Member> findAllMembers()
    {
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

    // ******************************************************************************
    // Add member
    // ******************************************************************************
    public void addMember( Member member )
    {
        memberRepository.save( member );
    }

    // ******************************************************************************
    // Update member
    // ******************************************************************************
    public void updateMember( Member memberToBeupdated )
    {
        memberRepository.save( memberToBeupdated );
    }

    // ******************************************************************************
    // Delete member
    // ******************************************************************************
    public void deletemember( Member member )
    {
        memberRepository.delete( member );
    }

    /**
     * Invoice services
     */
    // ******************************************************************************
    // Find BY ::Invoice by id
    // ******************************************************************************
    public Invoice findInvoiceById( Integer id )
    {
        Invoice invoice = invoiceRepository.findInvoiceById( id );
        return invoice;
    }

    // ******************************************************************************
    // Find all
    // ******************************************************************************
    public List<Invoice> findAllInvoices()
    {
        List<Invoice> invoiceList = invoiceRepository.findAll();
        return invoiceList;
    }

    // ******************************************************************************
    // Find By:: Invoices by status
    // ******************************************************************************
    public List<Invoice> findInvoicesByStatus( String status )
    {
        List<Invoice> invoiceList = invoiceRepository.findInvoicesByStatus( status );
        return invoiceList;
    }

    // ******************************************************************************
    // Find By:: Invoices by Raised date
    // ******************************************************************************
    public List<Invoice> findInvoicesByraisedDate( Date date )
    {
        List<Invoice> invoiceList = invoiceRepository.findInvoicesByRaisedDate( date );
        return invoiceList;
    }

    // ******************************************************************************
    // Add invoice
    // ******************************************************************************
    public void addInvoice( Invoice invoice )
    {
        invoiceRepository.save( invoice );
    }

    // ******************************************************************************
    // Update invoice
    // ******************************************************************************
    public void updateInvoice( Invoice invoiceToBeUpdated )
    {
        invoiceRepository.save( invoiceToBeUpdated );
    }

    // ******************************************************************************
    // Delete invoice
    // ******************************************************************************
    public void deleteInvoice( Invoice invoice )
    {
        invoiceRepository.delete( invoice );
    }
}
