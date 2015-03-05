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

import org.hisp.pmt.api.client.Client;
import org.hisp.pmt.api.organisation.Attachment;
import org.hisp.pmt.api.organisation.Office;
import org.hisp.pmt.api.organisation.ProjectInvestment;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
public class Project
{

    @Id
    @GeneratedValue
    @Column(name="project_id")
    private int id;

    private String name;

    private String description;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="expected_end_date")
    private Date expectedEndDate;

    @Column(name="actual_end_date")
    private Date endDate;

    private double amount;

    @Column(name="amount_currency")
    private String amountCurrency;

    private String type;

    private String status;

    @ManyToOne
    @JoinColumn(name="office_responsible")
    private Office officeResponsible;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL )
    private List<Member> members;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL )
    private List<Activity> activities;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL )
    private List<Milestone> mileStones;

    // investments
    @OneToMany( fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL )
    private List<ProjectInvestment> investments;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "project", cascade = CascadeType.ALL )
    private List<Attachment> documents;

    @ManyToOne
    private Client client;
    
    
    // ---------------------------------------------------------------------
    // --------------- Constructors---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

   
    public Project()
    {
        super();
    }

    public Project( int id, String name, String description, Date startDate, Date expectedEndDate, Date endDate,
        double amount, String amountCurrency, String type, String status, Office officeResponsible,
        List<Member> members, List<Activity> activities, List<Milestone> mileStones,
        List<ProjectInvestment> investments, List<Attachment> documents, Client client )
    {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.expectedEndDate = expectedEndDate;
        this.endDate = endDate;
        this.amount = amount;
        this.amountCurrency = amountCurrency;
        this.type = type;
        this.status = status;
        this.officeResponsible = officeResponsible;
        this.members = members;
        this.activities = activities;
        this.mileStones = mileStones;
        this.investments = investments;
        this.documents = documents;
        this.client = client;
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

    public double getAmount()
    {
        return amount;
    }

    public void setAmount( double amount )
    {
        this.amount = amount;
    }

    public String getAmountCurrency()
    {
        return amountCurrency;
    }

    public void setAmountCurrency( String amountCurrency )
    {
        this.amountCurrency = amountCurrency;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public List<Member> getMembers()
    {
        return members;
    }

    public void setMembers( List<Member> members )
    {
        this.members = members;
    }

    public List<Activity> getActivities()
    {
        return activities;
    }

    public void setActivities( List<Activity> activities )
    {
        this.activities = activities;
    }

    public List<Milestone> getMilestones()
    {
        return mileStones;
    }

    public void setMileStones( List<Milestone> mileStones )
    {
        this.mileStones = mileStones;
    }

    public List<ProjectInvestment> getInvestments()
    {
        return investments;
    }

    public void setInvestments( List<ProjectInvestment> investments )
    {
        this.investments = investments;
    }

    public List<Attachment> getDocuments()
    {
        return documents;
    }

    public void setDocuments( List<Attachment> documents )
    {
        this.documents = documents;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient( Client client )
    {
        this.client = client;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public Office getOfficeResponsible()
    {
        return officeResponsible;
    }

    public void setOfficeResponsible( Office officeResponsible )
    {
        this.officeResponsible = officeResponsible;
    }

    public List<Milestone> getMileStones()
    {
        return mileStones;
    }
}
