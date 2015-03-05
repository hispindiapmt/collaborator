package org.hisp.pmt.api.user;

import java.io.File;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hisp.pmt.api.organisation.Office;
import org.hisp.pmt.api.project.Activity;
import org.hisp.pmt.api.project.Member;

@Entity
public class User
{
    // ------------------------------
    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private boolean isActive = true;

    private String employeeId;

    private String email;

    private String contactNumber;

    private String address;

    private String remarks;

    private String currentDesignation;
    
    private File displayPicture;

    // organization - branch
    @ManyToOne
    @JoinColumn
    private Office office;

    @OneToOne
    @JoinColumn
    private UserCredential currentCredential;

    // salary particulars
    @OneToMany( mappedBy = "user" )
    private List<Payment> payments;

    // login credentials
    @OneToMany( mappedBy = "user" )
    private List<UserCredential> allCredentials;

    // user roles
    @JoinTable
    @ManyToMany( fetch = FetchType.EAGER)
    private List<UserRole> roles;

    // user as project members
    @OneToMany( mappedBy = "user" )
    private List<Member> members;

    // assigned tasks
    @OneToMany( mappedBy = "user" )
    private List<Activity> activities;

    // message groups
    @ManyToMany( mappedBy = "members" )
    private List<MessageGroup> messageGroups;

    // message group creator
    @OneToMany( mappedBy = "createdBy" )
    private List<MessageGroup> messageGroup;

    // messages sent
    @OneToMany( mappedBy = "sender" )
    private List<Message> messagesSent;

    // messages received will be linked with message groups

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

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive( boolean isActive )
    {
        this.isActive = isActive;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId( String employeeId )
    {
        this.employeeId = employeeId;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber( String contactNumber )
    {
        this.contactNumber = contactNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks( String remarks )
    {
        this.remarks = remarks;
    }

    public String getCurrentDesignation()
    {
        return currentDesignation;
    }

    public void setCurrentDesignation( String currentDesignation )
    {
        this.currentDesignation = currentDesignation;
    }

    public Office getOffice()
    {
        return office;
    }

    public void setOffice( Office office )
    {
        this.office = office;
    }

    public UserCredential getCurrentCredential()
    {
        return currentCredential;
    }

    public void setCurrentCredential( UserCredential currentCredential )
    {
        this.currentCredential = currentCredential;
    }

    public List<Payment> getPayments()
    {
        return payments;
    }

    public void setPayments( List<Payment> payments )
    {
        this.payments = payments;
    }

    public List<UserCredential> getAllCredentials()
    {
        return allCredentials;
    }

    public void setAllCredentials( List<UserCredential> allCredentials )
    {
        this.allCredentials = allCredentials;
    }

    public List<UserRole> getRoles()
    {
        return roles;
    }

    public void setRoles( List<UserRole> roles )
    {
        this.roles = roles;
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

    public List<MessageGroup> getMessageGroups()
    {
        return messageGroups;
    }

    public void setMessageGroups( List<MessageGroup> messageGroups )
    {
        this.messageGroups = messageGroups;
    }

    public List<MessageGroup> getMessageGroup()
    {
        return messageGroup;
    }

    public void setMessageGroup( List<MessageGroup> messageGroup )
    {
        this.messageGroup = messageGroup;
    }

    public List<Message> getMessagesSent()
    {
        return messagesSent;
    }

    public void setMessagesSent( List<Message> messagesSent )
    {
        this.messagesSent = messagesSent;
    }

    public File getDisplayPicture()
    {
        return displayPicture;
    }

    public void setDisplayPicture( File displayPicture )
    {
        this.displayPicture = displayPicture;
    }

    // --------------------------------------------------------------
}
