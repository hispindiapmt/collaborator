package org.hisp.pmt.repository;

import org.hisp.pmt.api.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer>{

}
