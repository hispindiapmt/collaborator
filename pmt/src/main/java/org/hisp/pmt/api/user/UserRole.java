package org.hisp.pmt.api.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hisp.pmt.api.project.Member;

@Entity
public class UserRole
{
    // ---------------------------------------
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    // role type

    // user authorities
    @JoinTable
    @ManyToMany
    private List<UserAuthority> authorities;

    // users who are assigned
    @ManyToMany( mappedBy = "roles" )
    private List<User> users;

    // users(members) who play this role in PROJECTS
    @OneToMany( mappedBy = "role" )
    private List<Member> members;

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public UserRole()
    {
        super();
    }

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

    public List<UserAuthority> getAuthorities()
    {
        return authorities;
    }

    public void setAuthorities( List<UserAuthority> authorities )
    {
        this.authorities = authorities;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers( List<User> users )
    {
        this.users = users;
    }

    // ----------------------------------------------------------------

}
