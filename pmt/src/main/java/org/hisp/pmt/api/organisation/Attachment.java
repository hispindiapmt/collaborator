package org.hisp.pmt.api.organisation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.api.user.Message;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
@Table(name="organisation_attachment")
public class Attachment
{
    @Id
    @GeneratedValue
    @Column(name = "attachement_id")
    private int id;

    private String name;

    private String document;

    // if it is a project attachment
    @ManyToOne
    @JoinColumn
    private Project project;

    // if it is a message attachment
    @ManyToOne
    @JoinColumn
    private Message message;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------
    public Attachment()
    {
        super();
    }

    public Attachment( int id, String name, String document, Project project, Message message )
    {
        super();
        this.id = id;
        this.name = name;
        this.document = document;
        this.project = project;
        this.message = message;
    }

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public int getId()
    {
        return id;
    }

    public Project getProject()
    {
        return project;
    }

    public void setProject( Project project )
    {
        this.project = project;
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

    public String getDocument()
    {
        return document;
    }

    public void setDocument( String document )
    {
        this.document = document;
    }

    public Message getMessage()
    {
        return message;
    }

    public void setMessage( Message message )
    {
        this.message = message;
    }

}
