package org.hisp.pmt.api.project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
@Table(name="project_milestone_history")
public class MilestoneHistory
{

    @Id
    @GeneratedValue
    @Column( name = "milestone_history_id" )
    private int id;

    // project milestone
    @ManyToOne
    @JoinColumn
    private Milestone milestone;

    @Column( name = "expected_date" )
    private Date expectedDate;

    private String status;

    private String remarks;

    private String reviews;

    // ---------------------------------------------------------------------
    // --------------- Constructors---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public MilestoneHistory()
    {
        super();
    }

    public MilestoneHistory( int id, Milestone milestone, Date expectedDate, String status, String remarks,
        String reviews )
    {
        super();
        this.id = id;
        this.milestone = milestone;
        this.expectedDate = expectedDate;
        this.status = status;
        this.remarks = remarks;
        this.reviews = reviews;
    }

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public Milestone getMilestone()
    {
        return milestone;
    }

    public void setMilestone( Milestone milestone )
    {
        this.milestone = milestone;
    }

    public Date getExpectedDate()
    {
        return expectedDate;
    }

    public void setExpectedDate( Date expectedDate )
    {
        this.expectedDate = expectedDate;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks( String remarks )
    {
        this.remarks = remarks;
    }

    public String getReviews()
    {
        return reviews;
    }

    public void setReviews( String reviews )
    {
        this.reviews = reviews;
    }
}
