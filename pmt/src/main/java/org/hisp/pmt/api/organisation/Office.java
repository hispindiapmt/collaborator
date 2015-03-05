package org.hisp.pmt.api.organisation;

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

import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.api.user.User;

/**
 * 
 * @authors- Anojan & Thimitha
 *asdfasdfasdfasdfasdfadfasdfasdf
 */

@Entity
@Table(name="organisation_office")
public class Office
{

    @Id
    @GeneratedValue
    @Column(name = "office_id")
    private int id;

    @ManyToOne
    @JoinColumn
    private Organisation organization;

    private String name;

    private String location;

    private String description;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "isheadoffice")
    private boolean isHeadOffice;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "office", cascade = CascadeType.ALL )
    private List<User> employees;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "officeResponsible", cascade = CascadeType.ALL )
    private List<Project> projects;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public Office( int id, String name, String location, String description, String contactNumber, String contactEmail,
        boolean isHeadOffice )
    {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
        this.isHeadOffice = isHeadOffice;
    }

    public Office()
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

    public Organisation getOrganization()
    {
        return organization;
    }

    public void setOrganization( Organisation organization )
    {
        this.organization = organization;
    }

    public List<User> getEmployees()
    {
        return employees;
    }

    public void setEmployees( List<User> employees )
    {
        this.employees = employees;
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

    public String getLocation()
    {
        return location;
    }

    public void setLocation( String location )
    {
        this.location = location;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber( String contactNumber )
    {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail()
    {
        return contactEmail;
    }

    public void setContactEmail( String contactEmail )
    {
        this.contactEmail = contactEmail;
    }

    public boolean isHeadOffice()
    {
        return isHeadOffice;
    }

    public void setHeadOffice( boolean isHeadOffice )
    {
        this.isHeadOffice = isHeadOffice;
    }

}
