package org.hisp.pmt.api.client;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hisp.pmt.api.project.Project;

@Entity
public class Client
{
    @Id
    @GeneratedValue
    private int id;

    private String orgName;

    private String location;

    private String contactPersonName;

    private String contactPersonEmail;

    private String contactPersonPhone;

    @OneToMany( mappedBy = "client" )
    private List<Project> projects;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public Client()
    {
        super();
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

    public String getOrgName()
    {
        return orgName;
    }

    public void setOrgName( String orgName )
    {
        this.orgName = orgName;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation( String location )
    {
        this.location = location;
    }

    public String getContactPersonName()
    {
        return contactPersonName;
    }

    public void setContactPersonName( String contactPersonName )
    {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonEmail()
    {
        return contactPersonEmail;
    }

    public void setContactPersonEmail( String contactPersonEmail )
    {
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getContactPersonPhone()
    {
        return contactPersonPhone;
    }

    public void setContactPersonPhone( String contactPersonPhone )
    {
        this.contactPersonPhone = contactPersonPhone;
    }

}
