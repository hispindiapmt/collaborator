package org.hisp.pmt.repository;

import org.hisp.pmt.api.user.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer>
{

}
