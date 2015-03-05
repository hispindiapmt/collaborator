package org.hisp.pmt.api.project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @authors- Anojan & Thimitha
 *
 */
@Entity
@Table(name="project_invoice")
public class Invoice
{

    @Id
    @GeneratedValue
    @Column( name = "invoice_id" )
    private int id;

    @ManyToOne
    @JoinColumn
    private Milestone milestone;

    @Column( name = "invoice_number" )
    private String invoiceNumber;

    private String status;

    @Column( name = "raised_date" )
    private Date raisedDate;

    @Column( name = "raised_amount" )
    private double raisedAmount;

    @Column( name = "recieved_date" )
    private Date receivedDate;

    @Column( name = "recieved_amount" )
    private double receivedAmount;

    private String remarks;

    // ---------------------------------------------------------------------
    // --------------- CONSTRUCTORS ----------------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public Invoice()
    {
        super();
    }

    public Invoice( int id, Milestone milestone, String invoiceNumber, String status, Date raisedDate,
        double raisedAmount, Date receivedDate, double receivedAmount, String remarks )
    {
        super();
        this.id = id;
        this.milestone = milestone;
        this.invoiceNumber = invoiceNumber;
        this.status = status;
        this.raisedDate = raisedDate;
        this.raisedAmount = raisedAmount;
        this.receivedDate = receivedDate;
        this.receivedAmount = receivedAmount;
        this.remarks = remarks;
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

    public Milestone getMilestone()
    {
        return milestone;
    }

    public void setMilestone( Milestone milestone )
    {
        this.milestone = milestone;
    }

    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    public void setInvoiceNumber( String invoiceNumber )
    {
        this.invoiceNumber = invoiceNumber;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public Date getRaisedDate()
    {
        return raisedDate;
    }

    public void setRaisedDate( Date raisedDate )
    {
        this.raisedDate = raisedDate;
    }

    public double getRaisedAmount()
    {
        return raisedAmount;
    }

    public void setRaisedAmount( double raisedAmount )
    {
        this.raisedAmount = raisedAmount;
    }

    public Date getReceivedDate()
    {
        return receivedDate;
    }

    public void setReceivedDate( Date receivedDate )
    {
        this.receivedDate = receivedDate;
    }

    public double getReceivedAmount()
    {
        return receivedAmount;
    }

    public void setReceivedAmount( double receivedAmount )
    {
        this.receivedAmount = receivedAmount;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks( String remarks )
    {
        this.remarks = remarks;
    }

}
