package org.hisp.pmt.repository;

import org.hisp.pmt.api.organisation.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepository
    extends JpaRepository<Organisation, Integer>
{

}
