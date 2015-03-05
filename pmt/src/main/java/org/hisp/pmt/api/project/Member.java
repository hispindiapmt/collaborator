package org.hisp.pmt.api.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hisp.pmt.api.user.User;
import org.hisp.pmt.api.user.UserRole;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
@Table(name="project_member")
public class Member
{
    @Id
    @GeneratedValue
    @Column( name = "member_id" )
    private Integer id;

    @ManyToOne
    @JoinColumn
    private Project project;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private UserRole role;

    // ---------------------------------------------------------------------
    // --------------- Constructors---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public Member()
    {
        super();
    }

    public Member( Integer id, Project project, User user, UserRole role )
    {
        super();
        this.id = id;
        this.project = project;
        this.user = user;
        this.role = role;
    }

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public Project getProject()
    {
        return project;
    }

    public void setProject( Project project )
    {
        this.project = project;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

    public UserRole getRole()
    {
        return role;
    }

    public void setRole( UserRole role )
    {
        this.role = role;
    }

}
