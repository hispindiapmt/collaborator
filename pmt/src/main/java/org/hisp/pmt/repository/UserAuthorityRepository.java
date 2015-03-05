package org.hisp.pmt.repository;


import org.hisp.pmt.api.user.UserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthorityRepository extends
		JpaRepository<UserAuthority, Integer> {
	
}
