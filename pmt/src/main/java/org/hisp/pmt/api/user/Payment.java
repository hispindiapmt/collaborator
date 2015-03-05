package org.hisp.pmt.api.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment
    implements Serializable
{
    // --------------------------------

    /**
     * 
     */
    private static final long serialVersionUID = -5527725817834037214L;

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn
    private User user;

    private double paymentAmount;

    private Date startDate;

    private Date endDate;

    private double overTimePercentage;

    // ---------------------------------------------------------------------
    // --------------- GETTERS and SETTERS ---------------------------------
    // ---------------------------------------------------------------------
    // ---------------------------------------------------------------------

    public User getUser()
    {
        return user;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public void setUser( User user )
    {
        this.user = user;
    }

    public double getPaymentAmount()
    {
        return paymentAmount;
    }

    public void setPaymentAmount( double paymentAmount )
    {
        this.paymentAmount = paymentAmount;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate( Date startDate )
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate( Date endDate )
    {
        this.endDate = endDate;
    }

    public double getOverTimePercentage()
    {
        return overTimePercentage;
    }

    public void setOverTimePercentage( double overTimePercentage )
    {
        this.overTimePercentage = overTimePercentage;
    }

    // ----------------------------------------------------------

    // --------------------------------------------------------------------

}
