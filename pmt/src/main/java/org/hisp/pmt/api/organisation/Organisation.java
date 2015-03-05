package org.hisp.pmt.api.organisation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * 
 * @authors- Anojan & Thimitha
 *
 */

@Entity
public class Organisation
{

    @Id
    @GeneratedValue
    @Column( name = "organisation_id" )
    private int id;

    private String name;

    private String logo;

    private String title;

    private String website;

    private String description;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "organization", cascade = CascadeType.ALL )
    private List<Office> office;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public Organisation( int id, String name, String logo, String title, String website, String description )
    {
        super();
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.title = title;
        this.website = website;
        this.description = description;
    }

    public Organisation()
    {
        super();
    }

    // ---------------------------------------------------------------------
    // --------------- LOGIC -----------------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public int getId()
    {
        return id;
    }

    public List<Office> getOffice()
    {
        return office;
    }

    public void setOffice( List<Office> office )
    {
        this.office = office;
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

    public String getLogo()
    {
        return logo;
    }

    public void setLogo( String logo )
    {
        this.logo = logo;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite( String website )
    {
        this.website = website;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }
}
