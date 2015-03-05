package org.hisp.pmt.repository;

import java.util.List;

import org.hisp.pmt.api.user.User;
import org.hisp.pmt.api.user.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer>{

    /**
     * @return : List of credentials of a certain user with certain username ( user name and old passwords, new password combinations)
     * @parameter : username 
     */
    List<UserCredential> findUserCredentialByUserName(String uname);
    
    
    /**
     * @return : List of credentials of a certain user
     * @parameter : user
     */
    List<UserCredential> findUserCredentialByUser(User user);

}
