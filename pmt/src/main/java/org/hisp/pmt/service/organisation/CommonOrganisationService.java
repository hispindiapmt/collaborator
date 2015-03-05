package org.hisp.pmt.service.organisation;

import org.hisp.pmt.api.organisation.Organisation;
import org.hisp.pmt.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonOrganisationService
{
    @Autowired
    OrganisationRepository organisationRepository;

    // ************************************************************************
    // ************************************************************************
    /**
     * The one and only organisation will be created in the start up with sample
     * data. it is not possible to add or delete organisation manually but it is
     * possible to edit the details of it
     */
    // ************************************************************************
    // ************************************************************************

    /**
     * Edit organisation
     */
    public void saveOrganisation( Organisation organisationToBeSaved )
    {
        organisationRepository.save( organisationToBeSaved );
    }

    /**
     * get organisation
     */
    public Organisation getOrganisation()
    {
        return organisationRepository.findOne( 1 );
    }
}
