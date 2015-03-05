package org.hisp.pmt.api.organisation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hisp.pmt.api.project.Project;


/**
 * 
 * @authors- Anojan & Thimitha
 *
 */

@Entity
@Table(name="organisation_project_investment")
public class ProjectInvestment
{

    @Id
    @GeneratedValue
    @Column( name = "project_investment_id" )
    private int id;

    // project
    @ManyToOne
    @JoinColumn
    private Project project;

    private String name;

    private String description;

    private double cost;

    @Column( name = "purchased_date" )
    private Date purchasedDate;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public ProjectInvestment()
    {
        super();
    }

    public ProjectInvestment( int id, Project project, String name, String description, double cost, Date purchasedDate )
    {
        super();
        this.id = id;
        this.project = project;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.purchasedDate = purchasedDate;
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

    public double getCost()
    {
        return cost;
    }

    public void setCost( double cost )
    {
        this.cost = cost;
    }

    public Date getPurchasedDate()
    {
        return purchasedDate;
    }

    public void setPurchasedDate( Date purchasedDate )
    {
        this.purchasedDate = purchasedDate;
    }

}
