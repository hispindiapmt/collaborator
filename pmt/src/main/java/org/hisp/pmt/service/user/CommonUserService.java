package org.hisp.pmt.service.user;

import java.util.ArrayList;
import java.util.List;

import org.hisp.pmt.api.user.Message;
import org.hisp.pmt.api.user.MessageGroup;
import org.hisp.pmt.api.user.Payment;
import org.hisp.pmt.api.user.User;
import org.hisp.pmt.api.user.UserAuthority;
import org.hisp.pmt.api.user.UserCredential;
import org.hisp.pmt.api.user.UserRole;
import org.hisp.pmt.repository.MessageGroupRepository;
import org.hisp.pmt.repository.MessageRepository;
import org.hisp.pmt.repository.UserAuthorityRepository;
import org.hisp.pmt.repository.UserCredentialRepository;
import org.hisp.pmt.repository.UserPaymentRepository;
import org.hisp.pmt.repository.UserRepository;
import org.hisp.pmt.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonUserService
{
    // 1
    @Autowired
    private UserRepository userRepository;

    // 2
    @Autowired
    private UserRoleRepository userRoleRepository;

    // 3
    @Autowired
    private UserAuthorityRepository userAuthorityRepository;

    // 4
    @Autowired
    private UserCredentialRepository userCredentialRepository;

    // 5
    @Autowired
    private MessageRepository messageRepository;

    // 6
    @Autowired
    private MessageGroupRepository messageGroupRepository;

    // 7
    @Autowired
    private UserPaymentRepository userPaymentRepository;

    /*
     * 1.Services for basic User operations--- 2.Services for user roles and
     * authorities---- 3.Services for user credentials---- 4.Services for
     * Messages--- 5.Services for Payments / salary particulars
     */

    /**
     * *************************************************************************
     * ****** 1.Services for basic User operations *****************************
     * *************************************************************************
     */

    /*
     * To find all users
     */
    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    /*
     * To find all active users
     */
    public List<User> findAllActiveUsers()
    {
        return userRepository.findUserByIsActive( true );
    }

    /*
     * To find all inactive users
     */
    public List<User> findAllInActiveUsers()
    {
        return userRepository.findUserByIsActive( false );
    }

    /*
     * find a user by id
     */
    public User findOne( Integer id )
    {
        User detail = userRepository.findOne( id );
        return detail;
    }
    /*
     * find a user by Username
     */
    public User findUserByUserName(String username)
    {
        User user = userCredentialRepository.findUserCredentialByUserName( username ).get( 0 ).getUser();
        return user;
    }
    /*
     * find users by first name or last name
     */
    public List<User> findUsersByName( String fname )
    {
        List<User> usersList = new ArrayList<User>();
        usersList.addAll( UserDbTransactionsByQuery.findUsersByName( fname ) );
        return usersList;
    }

    /*
     * Add new users - with credential
     */
    public void addUser( User userToBeAdded )
    {
        UserCredential credential = new UserCredential();
        credential.setUserName( userToBeAdded.getCurrentCredential().getUserName() );
        credential.setPassword( userToBeAdded.getCurrentCredential().getPassword() );
        userCredentialRepository.save( credential );

        userToBeAdded.setCurrentCredential( credential );
        userRepository.save( userToBeAdded );

        credential.setUser( userToBeAdded );
        userCredentialRepository.save( credential );
    }

    /*
     * Edit and save existing users
     */
    public void saveUser( User userToBeSaved )
    {
        userRepository.save( userToBeSaved );
    }

    /*
     * delete user
     */

    public void deleteUser( User userToBeDeleted )
    {
        userRepository.delete( userToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 2.Services for User roles *****************************
     * *************************************************************************
     */
    /*
     * find all user roles
     */
    public List<UserRole> findAllUserRoles()
    {
        return userRoleRepository.findAll();
    }

    /*
     * find user role with certain id
     */
    public UserRole findUserRoleById( int id )
    {
        return userRoleRepository.findOne( id );
    }

    /*
     * add new user role
     */
    public void addUserRole( UserRole roleToBeAdded )
    {
        userRoleRepository.save( roleToBeAdded );
    }

    /*
     * add a userRole to a user
     */
    public void addUserRoleToUser( Integer userId, Integer roleId )
    {
        User gotUser = userRepository.findOne( userId );
        UserRole gotRole = userRoleRepository.findOne( roleId );
        List<UserRole> roles = gotUser.getRoles();
        if ( !isThisUserHasThisRole( gotUser, gotRole ) )
        {
            roles.add( gotRole );
        }
        gotUser.setRoles( roles );
        userRepository.save( gotUser );
    }

    /*
     * remove a userRole from a user
     */
    public void removeUserRoleFromUser( Integer userId, Integer roleId )
    {
        User gotUser = userRepository.findOne( userId );
        List<UserRole> roles = gotUser.getRoles();
        //tempRole is created to avoid concurrentModificationException
        List<UserRole> tempRoles = roles;
        for(UserRole uRole : roles)
        {
            if(uRole.getId()==roleId)
            {
                tempRoles.remove( uRole );
            }
        }
        
        roles.clear();
        roles.addAll( tempRoles );
        gotUser.setRoles( roles );
        userRepository.save( gotUser );
    }

    /*
     * to check whether a role is available in the list of roles of a user
     */
    private boolean isThisUserHasThisRole( User user, UserRole role )
    {
        List<UserRole> rolesOfThisUser = user.getRoles();
        boolean isFound = false;
        for ( UserRole uRole : rolesOfThisUser )
        {
            if ( uRole.getId() == role.getId() )
            {
                isFound = true;
            }
        }
        return isFound;
    }

    /*
     * edit and save an existing user role
     */
    public void saveUserRole( UserRole roleToBeSaved )
    {
        userRoleRepository.save( roleToBeSaved );
    }

    /*
     * delete a user role
     */
    public void deleteUserRole( UserRole roleToBeDeleted )
    {
        userRoleRepository.delete( roleToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 3.Services for User authorities *****************************
     * *************************************************************************
     */
    /*
     * find all user authorities
     */
    public List<UserAuthority> findAllUserAuthorities()
    {
        return userAuthorityRepository.findAll();
    }

    /*
     * find user authority with certain id
     */
    public UserAuthority findUserAuthorityById( int id )
    {
        return userAuthorityRepository.findOne( id );
    }

    /*
     * add new user authority
     */
    public void addUserAuthority( UserAuthority authorityToBeAdded )
    {
        userAuthorityRepository.save( authorityToBeAdded );
    }

    /*
     * edit and save an existing user authority
     */
    public void saveUserAuthority( UserAuthority authorityToBeSaved )
    {
        userAuthorityRepository.save( authorityToBeSaved );
    }

    /*
     * delete a user authority
     */
    public void deleteUserAuthority( UserAuthority authorityToBeDeleted )
    {
        userAuthorityRepository.delete( authorityToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 4.Services for User credentials *****************************
     * *************************************************************************
     */
    /*
     * find whether a username and password combination is correct and is the
     * current combination
     */
    public boolean isThisUserCredentialCorrect( String userName, String passWord )
    {
        List<UserCredential> givenCredentialList = userCredentialRepository.findUserCredentialByUserName( userName );
        boolean isCorrect = false;
        for ( UserCredential credential : givenCredentialList )
        {
            if ( credential.getPassword() == passWord && credential.getUser().getCurrentCredential() == credential )
            {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    /*
     * Find the list of credentials for a certain user
     */
    public List<UserCredential> findAllCrentialsOfThisUser( User user )
    {
        return userCredentialRepository.findUserCredentialByUser( user );
    }

    /*
     * find all user credential
     */
    public List<UserCredential> findAllUserCredentials()
    {
        return userCredentialRepository.findAll();
    }

    /*
     * find user credential of certain user
     */
    public UserCredential findUserCredentialById( int id )
    {
        return userCredentialRepository.findOne( id );
    }

    /*
     * add new user credential
     */
    public void addUserCredential( UserCredential credentialToBeAdded )
    {
        userCredentialRepository.save( credentialToBeAdded );
    }

    /*
     * edit and save an existing user credential
     */
    public void saveUserCredential( UserCredential credentialToBeSaved )
    {
        userCredentialRepository.save( credentialToBeSaved );
    }

    /*
     * delete a user credential
     */
    public void deleteUserCredential( UserCredential credentialToBeDeleted )
    {
        userCredentialRepository.delete( credentialToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 5.Services for messages *****************************
     * *************************************************************************
     */
    /*
     * find all Messages
     */
    public List<Message> findAllMessages()
    {
        return messageRepository.findAll();
    }

    /*
     * find Message with certain id
     */
    public Message findMessageById( int id )
    {
        return messageRepository.findOne( id );
    }

    /*
     * add new Message
     */
    public void addMessage( Message messageToBeAdded )
    {
        messageRepository.save( messageToBeAdded );
    }

    /*
     * edit and save an existing Message
     */
    public void saveMessage( Message messageToBeSaved )
    {
        messageRepository.save( messageToBeSaved );
    }

    /*
     * delete a Message
     */
    public void deleteMessage( Message messageToBeDeleted )
    {
        messageRepository.delete( messageToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 6.Services for message groups*****************************
     * *************************************************************************
     */
    /*
     * find all MessageGroups
     */
    public List<MessageGroup> findAllMessageGroups()
    {
        return messageGroupRepository.findAll();
    }

    /*
     * find MessageGroup with certain id
     */
    public MessageGroup findMessageGroupById( int id )
    {
        return messageGroupRepository.findOne( id );
    }

    /*
     * add new MessageGroup
     */
    public void addMessageGroup( MessageGroup messageGroupToBeAdded )
    {
        messageGroupRepository.save( messageGroupToBeAdded );
    }

    /*
     * edit and save an existing MessageGroup
     */
    public void saveMessageGroup( MessageGroup messageGroupToBeSaved )
    {
        messageGroupRepository.save( messageGroupToBeSaved );
    }

    /*
     * delete a MessageGroup
     */
    public void deleteMessageGroup( MessageGroup messageGroupToBeDeleted )
    {
        messageGroupRepository.delete( messageGroupToBeDeleted );
    }

    /**
     * *************************************************************************
     * ****** 7.Services for payment details*****************************
     * *************************************************************************
     */
    /*
     * find all Payment details
     */
    public List<Payment> findAllPaymentDetails()
    {
        return userPaymentRepository.findAll();
    }

    /*
     * find PaymentDetail with certain id
     */
    public Payment findPaymentDetailById( int id )
    {
        return userPaymentRepository.findOne( id );
    }

    /*
     * add new PaymentDetail
     */
    public void addPaymentDetail( Payment paymentInfoToBeAdded )
    {
        userPaymentRepository.save( paymentInfoToBeAdded );
    }

    /*
     * edit and save an existing PaymentDetail
     */
    public void savePaymentDetail( Payment paymentInfoToBeSaved )
    {
        userPaymentRepository.save( paymentInfoToBeSaved );
    }

    /*
     * delete a PaymentDetail
     */
    public void deletePaymentDetail( Payment paymentInfoToBeDeleted )
    {
        userPaymentRepository.delete( paymentInfoToBeDeleted );
    }

}
