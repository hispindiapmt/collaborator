package org.hisp.pmt.api.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class UserAuthority
{

    // ---------------------------------
    @Id
    @GeneratedValue
    private int id;

    @ManyToMany( mappedBy = "authorities" )
    private List<UserRole> roles;

    private String name;

    private String description;

    public UserAuthority( String name )
    {
        super();
        this.name = name;
    }

    public UserAuthority( )
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

    public List<UserRole> getRoles()
    {
        return roles;
    }

    public void setRoles( List<UserRole> roles )
    {
        this.roles = roles;
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

    // -------------------------------------------------------------------------------

}
