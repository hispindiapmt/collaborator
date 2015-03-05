package org.hisp.pmt.api.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MessageGroup
{
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Date createdDate;

    @ManyToOne
    @JoinColumn
    private User createdBy;

    @ManyToMany
    private List<User> members;

    // messages received
    @OneToMany( mappedBy = "recipients" )
    private List<Message> messagesReceived;

    // messages sent will be linked with individual users

    public MessageGroup( Integer id, String name, Date createdDate, User createdBy, List<User> members )
    {
        super();
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.members = members;
    }

    public MessageGroup()
    {
        super();
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
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

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate( Date createdDate )
    {
        this.createdDate = createdDate;
    }

    public User getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy( User createdBy )
    {
        this.createdBy = createdBy;
    }

    public List<User> getMembers()
    {
        return members;
    }

    public void setMembers( List<User> members )
    {
        this.members = members;
    }

    public List<Message> getMessagesReceived()
    {
        return messagesReceived;
    }

    public void setMessagesReceived( List<Message> messagesReceived )
    {
        this.messagesReceived = messagesReceived;
    }

}
