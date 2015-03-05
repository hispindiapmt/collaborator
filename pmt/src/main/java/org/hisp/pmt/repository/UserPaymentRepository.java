package org.hisp.pmt.repository;

import org.hisp.pmt.api.user.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentRepository extends JpaRepository<Payment, Integer>
{

}
