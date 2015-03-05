package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.project.Member;
import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.api.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Integer>
{
    /**
     * 
     * @param Integer id
     * @return Member with a given id
     */
    // ******************************************************************************
    // Find BY ::Member by ID
    // ******************************************************************************
    Member findMemberById( Integer id );
    
    /**
     * 
     * @param UserRole role
     * @return List of members with given role
     */
    //******************************************************************************
    // Find BY ::Member by Role
    //******************************************************************************
    List<Member> findMembersByRole( UserRole role );       
    
    /**
     * 
     * @param Project project
     * @return List of members for a given project
     */
    //******************************************************************************
    // Find BY ::Member by project
    //******************************************************************************
    List<Member> findMembersByProject( Project project );
}
