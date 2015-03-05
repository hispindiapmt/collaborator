package org.hisp.pmt.api.project;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
@Table(name="project_milestone")
public class Milestone
{

    @Id
    @GeneratedValue
    @Column( name = "milestone_id" )
    private int id;

    // project
    @ManyToOne
    @JoinColumn
    private Project project;

    private String name;

    private String description;

    @Column( name = "expected_date" )
    private Date expectedDate;

    private String status;

    private String remarks;

    private String reviews;

    // milestone history
    @OneToMany( fetch = FetchType.EAGER, mappedBy = "milestone", cascade = CascadeType.ALL )
    @Column( name = "milestone_histories" )
    private List<MilestoneHistory> mileStoneHistories;

    // invoices
    @OneToMany( fetch = FetchType.EAGER, mappedBy = "milestone", cascade = CascadeType.ALL )
    private List<Invoice> invoices;

    // ---------------------------------------------------------------------
    // --------------- Constructors---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public Milestone()
    {
        super();
    }

    public Milestone( int id, Project project, String name, String description, Date expectedDate, String status,
        String remarks, String reviews, List<MilestoneHistory> mileStoneHistories, List<Invoice> invoices )
    {
        super();
        this.id = id;
        this.project = project;
        this.name = name;
        this.description = description;
        this.expectedDate = expectedDate;
        this.status = status;
        this.remarks = remarks;
        this.reviews = reviews;
        this.mileStoneHistories = mileStoneHistories;
        this.invoices = invoices;
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

    public Project getProject()
    {
        return project;
    }

    public void setProject( Project project )
    {
        this.project = project;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
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

    public List<MilestoneHistory> getMileStoneHistories()
    {
        return mileStoneHistories;
    }

    public void setMileStoneHistories( List<MilestoneHistory> mileStoneHistories )
    {
        this.mileStoneHistories = mileStoneHistories;
    }

    public List<Invoice> getInvoices()
    {
        return invoices;
    }

    public void setInvoices( List<Invoice> invoices )
    {
        this.invoices = invoices;
    }
}
