package org.hisp.pmt.repository;

import org.hisp.pmt.api.organisation.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, Integer>
{
    
}
