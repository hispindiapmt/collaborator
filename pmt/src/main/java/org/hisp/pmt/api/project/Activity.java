package org.hisp.pmt.api.project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hisp.pmt.api.user.User;


/**
 * 
 * @authors- Anojan & Thimitha
 *
 */

@Entity
@Table(name="project_activity")
public class Activity
{
    @Id
    @GeneratedValue
    @Column( name = "activity_id" )
    private int id;

    @ManyToOne
    @JoinColumn
    private Project project;

    private String description;

    private String type;

    @Column( name = "start_date" )
    private Date startDate;

    @Column( name = "expected_end_date" )
    private Date expectedEndDate;

    @Column( name = "actual_end_date" )
    private Date endDate;

    @Column( name = "estimated_hours" )
    private double estimatedHours;

    private String status;

    private String remarks;

    private String rating;

    // the doer
    @ManyToOne
    @JoinColumn
    private User user;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public Activity()
    {
        super();
    }
    
    

    public Activity( int id, Project project, String description, String type, Date startDate, Date expectedEndDate,
        Date endDate, double estimatedHours, String status, String remarks, String rating, User user )
    {
        super();
        this.id = id;
        this.project = project;
        this.description = description;
        this.type = type;
        this.startDate = startDate;
        this.expectedEndDate = expectedEndDate;
        this.endDate = endDate;
        this.estimatedHours = estimatedHours;
        this.status = status;
        this.remarks = remarks;
        this.rating = rating;
        this.user = user;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate( Date startDate )
    {
        this.startDate = startDate;
    }

    public Date getExpectedEndDate()
    {
        return expectedEndDate;
    }

    public void setExpectedEndDate( Date expectedEndDate )
    {
        this.expectedEndDate = expectedEndDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate( Date endDate )
    {
        this.endDate = endDate;
    }

    public double getEstimatedHours()
    {
        return estimatedHours;
    }

    public void setEstimatedHours( double estimatedHours )
    {
        this.estimatedHours = estimatedHours;
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

    public String getRating()
    {
        return rating;
    }

    public void setRating( String rating )
    {
        this.rating = rating;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

}
