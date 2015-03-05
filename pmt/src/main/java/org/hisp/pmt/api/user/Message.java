package org.hisp.pmt.api.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hisp.pmt.api.organisation.Attachment;

@Entity
public class Message
{
    @Id
    @GeneratedValue
    private Integer id;

    private String message;

    private Date time;

    @ManyToOne
    @JoinColumn
    private User sender;

    @ManyToOne
    @JoinColumn
    private MessageGroup recipients;

    //attachments; if any
    @OneToMany(mappedBy="message")
    private List<Attachment>attachments;
    
    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public Date getTime()
    {
        return time;
    }

    public void setTime( Date time )
    {
        this.time = time;
    }

    public User getSender()
    {
        return sender;
    }

    public void setSender( User sender )
    {
        this.sender = sender;
    }

    public MessageGroup getRecipients()
    {
        return recipients;
    }

    public void setRecipients( MessageGroup recipients )
    {
        this.recipients = recipients;
    }

    public List<Attachment> getAttachments()
    {
        return attachments;
    }

    public void setAttachments( List<Attachment> attachments )
    {
        this.attachments = attachments;
    }

}
