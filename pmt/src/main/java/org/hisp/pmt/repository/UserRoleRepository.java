package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

	// ***********************************************************************
	// FIND USER ROLES
	// ***********************************************************************
	/**
	 * @return : User role with certain id
	 * @parameter : user role id (auto number)
	 */
	UserRole findUserRoleById(int id);
	
	/**
	 * @return : List of user roles with certain name
	 * @parameter : user role name (auto number)
	 */
	List<UserRole> findUserRoleByName(String roleName);
}