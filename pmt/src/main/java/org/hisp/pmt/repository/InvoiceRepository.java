package org.hisp.pmt.repository;

import java.util.Date;
import java.util.List;

import org.hisp.pmt.api.project.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>
{
    /**
     * 
     * @param Integer id
     * @return Invoice with given id
     */
    // ******************************************************************************
    // Find BY :: Invoice by ID
    // ******************************************************************************
    Invoice findInvoiceById( Integer id );
    
    /**
     * 
     * @param invoiceNumber
     * @return Invoice for a given invoice number
     */
    //******************************************************************************
    // Find BY :: Invoice by status
    // ******************************************************************************
    Invoice findInvoiceByInvoiceNumber( String invoiceNumber);
    
    /**
     * 
     * @param String status
     * @return List of Invoices with given status
     */
    // ******************************************************************************
    // Find BY :: Invoice by status
    // ******************************************************************************
    List<Invoice> findInvoicesByStatus( String status);
    
    /**
     * 
     * @param date
     * @return
     */
    //******************************************************************************
    // Find BY :: Invoice by Raised date
    // ******************************************************************************
    List<Invoice> findInvoicesByRaisedDate(Date date);
    
    
    
}
