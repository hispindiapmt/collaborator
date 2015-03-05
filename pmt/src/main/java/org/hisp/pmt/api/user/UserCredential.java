package org.hisp.pmt.api.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserCredential
{

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn
    private User user;

    private String userName;

    private String password;

    private Date changedDate;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public UserCredential()
    {
        super();
    }

    
    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public User getUser()
    {
        return user;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public Date getChangedDate()
    {
        return changedDate;
    }

    public void setChangedDate( Date changedDate )
    {
        this.changedDate = changedDate;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    // ---------------------------------------------------------------

}
