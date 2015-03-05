package org.hisp.pmt.service.user;

import java.util.List;

import org.hisp.pmt.api.user.User;
import org.hisp.pmt.api.user.UserAuthority;
import org.hisp.pmt.api.user.UserRole;
import org.hisp.pmt.repository.UserAuthorityRepository;
import org.hisp.pmt.repository.UserRepository;
import org.hisp.pmt.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserPermissionService
{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UserAuthorityRepository userAuthorityRepository;

    // *************************************************************************************
    // USERS and ROLES
    // *************************************************************************************
    /**
     * @return : true or false - whether a certain user has certain role
     * @parameter : a user and a role
     */
    public boolean doesThisUserHaveThisRole( User user, UserRole role )
    {
        boolean found = false;

        if ( user != null && role != null )
        {
            List<UserRole> rolesOfThisUser = user.getRoles();
            if ( rolesOfThisUser.contains( role ) )
                found = true;
        }
        return found;
    }

    /**
     * @return : true or false - whether a certain user has certain role
     * @parameter : a user ID and a role ID
     */
    public boolean doesThisUserHaveThisRole( int userID, int roleID )
    {
        User givenUser = userRepository.findUserById( userID );
        UserRole givenRole = userRoleRepository.findUserRoleById( roleID );

        return doesThisUserHaveThisRole( givenUser, givenRole );
    }

    // *************************************************************************************
    // USERS and AUTHORITIES
    // *************************************************************************************
    /**
     * @return : true or false - whether a certain user has certain authority
     * @parameter : a user and a authority
     */
    public boolean doesThisUserHaveThisAuthority( User user, UserAuthority authority )
    {
        boolean found = false;

        if ( user != null && authority != null )
        {
            List<UserRole> rolesOfThisUser = user.getRoles();

            for ( UserRole role : rolesOfThisUser )
            {
                List<UserAuthority> authoritiesOfThisRole = role.getAuthorities();
                if ( authoritiesOfThisRole.contains( authority ) )
                {
                    found = true;
                }
            }
        }
        return found;
    }

    /**
     * @return : true or false - whether a certain user has certain authority
     * @parameter : a user ID and a authority ID
     */
    public boolean doesThisUserHaveThisAuthority( int userID, int authorityID )
    {
        User givenUser = userRepository.findUserById( userID );
        UserAuthority givenAuthority = userAuthorityRepository.findOne( authorityID );

        return doesThisUserHaveThisAuthority( givenUser, givenAuthority );
    }

}
