package org.hisp.pmt.service.organisation;

import java.util.List;

import org.hisp.pmt.api.organisation.Office;
import org.hisp.pmt.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonOfficeService
{
    @Autowired
    OfficeRepository officeRepository;

    /**
     * add office
     */
    public void addOrganisation( Office officeToBeAdded )
    {
        officeRepository.save( officeToBeAdded );
    }

    /**
     * edit office
     */
    public void saveOrganisation( Office officeToBeSaved )
    {
        officeRepository.save( officeToBeSaved );
    }

    /**
     * find office by id
     */
    public Office findOfficeById( int id )
    {
        return officeRepository.findOne( id );
    }
    
    /**
     * find all offices of the organisation
     */
    public List<Office> findAllOffice()
    {
        return officeRepository.findAll();
    }
    
    
}
