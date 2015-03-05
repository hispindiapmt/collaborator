package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
    extends JpaRepository<User, Integer>
{
    /**
     * Find all active users
     * 
     * @return : list of active or inactive users
     * @parameter : true for active , false for inactive
     */
    List<User> findUserByIsActive( boolean isActive );

    // ******************************************************************************
    // Find BY :: ID , Employee ID and Current designation
    // ******************************************************************************

    /**
     * @return : User with certain id
     * @parameter : user id (auto number)
     */
    User findUserById( int id );

    /**
     * @return : User with certain employee id
     * @parameter : employee id
     */
    User findUserByEmployeeId( String employeeId );

    /**
     * @return : List of users with certain designation parameter
     * @parameter : Designation alike string
     */
    List<User> findUsersByCurrentDesignation( String designation );

    // ******************************************************************************
    // Find BY :: Names : First name and Last name ( conditional combination AND
    // & OR )
    // ******************************************************************************

    /**
     * @return : List of users with certain first name parameter
     * @parameter : First name alike string
     */
    List<User> findUsersByFirstName( String firstName );

    /**
     * @return : List of users with certain last name parameter
     * @parameter : Last name alike string
     */
    List<User> findUsersByLastName( String lastName );

    /**
     * @return : List of users with certain first name OR last name
     * @parameter : First or last name alike string
     */
    List<User> findUsersByFirstNameOrLastName( String firstName, String lastName );

    /**
     * @return : List of users with certain first name AND certain last name
     * @parameter : First name alike string and last name alike string
     */
    List<User> findUsersByFirstNameAndLastName( String firstName, String lastName );

    // ******************************************************************************
    // Find BY :: Address, contact number and email address
    // ******************************************************************************

    /**
     * @return : List of users with certain address
     * @parameter : Address alike string
     */
    List<User> findUsersByAddress( String address );

    /**
     * @return : List of users with certain contact number
     * @parameter : Contact number alike string
     */
    List<User> findUsersByContactNumber( String contactNumber );

    /**
     * @return : List of users with certain email
     * @parameter : Email alike string
     */
    List<User> findUsersByEmail( String email );

    // ******************************************************************************
    // Find BY :: others
    // ******************************************************************************

    /**
     * @return : List of users with certain remark
     * @parameter : Remark alike string
     */
    List<User> findUsersByRemarks( String remarks );

}
