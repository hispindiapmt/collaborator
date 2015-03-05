package org.hisp.pmt.service.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.hisp.pmt.api.organisation.Office;
import org.hisp.pmt.api.organisation.Organisation;
import org.hisp.pmt.api.user.User;
import org.hisp.pmt.api.user.UserAuthority;
import org.hisp.pmt.api.user.UserCredential;
import org.hisp.pmt.api.user.UserRole;
import org.hisp.pmt.repository.OfficeRepository;
import org.hisp.pmt.repository.OrganisationRepository;
import org.hisp.pmt.repository.UserAuthorityRepository;
import org.hisp.pmt.repository.UserCredentialRepository;
import org.hisp.pmt.repository.UserRepository;
import org.hisp.pmt.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class InitDbService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCredentialRepository userCredentialRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UserAuthorityRepository userAuthorityRepository;

    @Autowired
    private OrganisationRepository organisationRepository;

    @Autowired
    private OfficeRepository officeRepository;

    @PostConstruct
    public void init()
    {

        // *****************************************************************
        /******************************************************************
         * ADDING ORGANISATION AND AN OFFICE
         ******************************************************************/
        // *****************************************************************

        organisationRepository.flush();
        officeRepository.flush();

        Organisation organisation = new Organisation();
        organisation.setName( "HISP INDIA" );
        organisation.setTitle( "Society for Health Information Systems" );
        organisation.setDescription( "This is a sample description; you can edit it afterwards" );
        organisationRepository.save( organisation );

        Office headOffice = new Office();
        headOffice.setName( "HISP INDIA Noida" );
        headOffice.setLocation( "Noida, UP" );
        headOffice.setHeadOffice( true );
        headOffice.setOrganization( organisation );
        officeRepository.save( headOffice );

        // *****************************************************************
        /******************************************************************
         * ADDING SOME DEFAULT USER AUTHORITIES
         ******************************************************************/
        // *****************************************************************

        // flushing all authorities first
        userAuthorityRepository.flush();

        // Authorities related to User
        UserAuthority addUser = new UserAuthority( "AUTH|user|add" );
        userAuthorityRepository.save( addUser );

        UserAuthority deleteUser = new UserAuthority( "AUTH|user|delete" );
        userAuthorityRepository.save( deleteUser );

        UserAuthority editUser = new UserAuthority( "AUTH|user|edit" );
        userAuthorityRepository.save( editUser );

        UserAuthority viewUser = new UserAuthority( "AUTH|user|view" );
        userAuthorityRepository.save( viewUser );

        // Authorities related to User Authorities
        UserAuthority addUserAuthority = new UserAuthority( "AUTH|user_authority|add" );
        userAuthorityRepository.save( addUserAuthority );

        UserAuthority deleteUserAuthority = new UserAuthority( "AUTH|user_authority|delete" );
        userAuthorityRepository.save( deleteUserAuthority );

        UserAuthority editUserAuthority = new UserAuthority( "AUTH|user_authority|edit" );
        userAuthorityRepository.save( editUserAuthority );

        UserAuthority viewUserAuthority = new UserAuthority( "AUTH|user_authority|view" );
        userAuthorityRepository.save( viewUserAuthority );

        // Authorities related to User Credentials
        UserAuthority addUserCredential = new UserAuthority( "AUTH|user_credential|add" );
        userAuthorityRepository.save( addUserCredential );

        UserAuthority deleteUserCredential = new UserAuthority( "AUTH|user_credential|delete" );
        userAuthorityRepository.save( deleteUserCredential );

        UserAuthority editUserCredential = new UserAuthority( "AUTH|user_credential|edit" );
        userAuthorityRepository.save( editUserCredential );

        UserAuthority viewUserCredential = new UserAuthority( "AUTH|user_credential|view" );
        userAuthorityRepository.save( viewUserCredential );

        // Authorities related to User Roles
        UserAuthority addUserRole = new UserAuthority( "AUTH|user_role|add" );
        userAuthorityRepository.save( addUserRole );

        UserAuthority deleteUserRole = new UserAuthority( "AUTH|user_role|delete" );
        userAuthorityRepository.save( deleteUserRole );

        UserAuthority editUserRole = new UserAuthority( "AUTH|user_role|edit" );
        userAuthorityRepository.save( editUserRole );

        UserAuthority viewUserRole = new UserAuthority( "AUTH|user_role|view" );
        userAuthorityRepository.save( viewUserRole );

        // Authorities related to Activities
        UserAuthority addActivity = new UserAuthority( "AUTH|activity|add" );
        userAuthorityRepository.save( addActivity );

        UserAuthority deleteActivity = new UserAuthority( "AUTH|activity|delete" );
        userAuthorityRepository.save( deleteActivity );

        UserAuthority editActivity = new UserAuthority( "AUTH|activity|edit" );
        userAuthorityRepository.save( editActivity );

        UserAuthority viewActivity = new UserAuthority( "AUTH|activity|view" );
        userAuthorityRepository.save( viewActivity );

        // Authorities related to Invoice
        UserAuthority addInvoice = new UserAuthority( "AUTH|invoice|add" );
        userAuthorityRepository.save( addInvoice );

        UserAuthority deleteInvoice = new UserAuthority( "AUTH|invoice|delete" );
        userAuthorityRepository.save( deleteInvoice );

        UserAuthority editInvoice = new UserAuthority( "AUTH|invoice|edit" );
        userAuthorityRepository.save( editInvoice );

        UserAuthority viewInvoice = new UserAuthority( "AUTH|invoice|view" );
        userAuthorityRepository.save( viewInvoice );

        // Authorities related to Member
        UserAuthority addMember = new UserAuthority( "AUTH|member|add" );
        userAuthorityRepository.save( addMember );

        UserAuthority deleteMember = new UserAuthority( "AUTH|member|delete" );
        userAuthorityRepository.save( deleteMember );

        UserAuthority editMember = new UserAuthority( "AUTH|member|edit" );
        userAuthorityRepository.save( editMember );

        UserAuthority viewMember = new UserAuthority( "AUTH|member|view" );
        userAuthorityRepository.save( viewMember );

        // Authorities related to Milestones
        UserAuthority addMilestone = new UserAuthority( "AUTH|milestone|add" );
        userAuthorityRepository.save( addMilestone );

        UserAuthority deleteMilestone = new UserAuthority( "AUTH|milestone|delete" );
        userAuthorityRepository.save( deleteMilestone );

        UserAuthority editMilestone = new UserAuthority( "AUTH|milestone|edit" );
        userAuthorityRepository.save( editMilestone );

        UserAuthority viewMilestone = new UserAuthority( "AUTH|milestone|view" );
        userAuthorityRepository.save( viewMilestone );

        // Authorities related to Milestone Histories
        UserAuthority addMilestoneHistory = new UserAuthority( "AUTH|milestone_history|add" );
        userAuthorityRepository.save( addMilestoneHistory );

        UserAuthority deleteMilestoneHistory = new UserAuthority( "AUTH|milestone_history|delete" );
        userAuthorityRepository.save( deleteMilestoneHistory );

        UserAuthority editMilestoneHistory = new UserAuthority( "AUTH|milestone_history|edit" );
        userAuthorityRepository.save( editMilestoneHistory );

        UserAuthority viewMilestoneHistory = new UserAuthority( "AUTH|milestone_history|view" );
        userAuthorityRepository.save( viewMilestoneHistory );

        // Authorities related to Projects
        UserAuthority addProject = new UserAuthority( "AUTH|project|add" );
        userAuthorityRepository.save( addProject );

        UserAuthority deleteProject = new UserAuthority( "AUTH|project|delete" );
        userAuthorityRepository.save( deleteProject );

        UserAuthority editProject = new UserAuthority( "AUTH|project|edit" );
        userAuthorityRepository.save( editProject );

        UserAuthority viewProject = new UserAuthority( "AUTH|project|view" );
        userAuthorityRepository.save( viewProject );

        // Authorities related to Organization
        UserAuthority viewOrganisation = new UserAuthority( "AUTH|organisation|view" );
        userAuthorityRepository.save( viewOrganisation );

        UserAuthority addOrganisation = new UserAuthority( "AUTH|organisation|add" );
        userAuthorityRepository.save( addOrganisation );

        UserAuthority editOrganisation = new UserAuthority( "AUTH|organisation|edit" );
        userAuthorityRepository.save( editOrganisation );

        UserAuthority deleteOrganisation = new UserAuthority( "AUTH|organisation|delete" );
        userAuthorityRepository.save( deleteOrganisation );

        // Authorities related to Attachments
        UserAuthority viewAttachment = new UserAuthority( "AUTH|attachment|view" );
        userAuthorityRepository.save( viewAttachment );

        UserAuthority addAttachment = new UserAuthority( "AUTH|attachment|add" );
        userAuthorityRepository.save( addAttachment );

        UserAuthority editAttachment = new UserAuthority( "AUTH|attachment|edit" );
        userAuthorityRepository.save( editAttachment );

        UserAuthority deleteAttachment = new UserAuthority( "AUTH|attachment|delete" );
        userAuthorityRepository.save( deleteAttachment );

        // Authorities related to Offices
        UserAuthority viewOffice = new UserAuthority( "AUTH|office|view" );
        userAuthorityRepository.save( viewOffice );

        UserAuthority addOffice = new UserAuthority( "AUTH|office|add" );
        userAuthorityRepository.save( addOffice );

        UserAuthority editOffice = new UserAuthority( "AUTH|office|edit" );
        userAuthorityRepository.save( editOffice );

        UserAuthority deleteOffice = new UserAuthority( "AUTH|office|delete" );
        userAuthorityRepository.save( deleteOffice );

        // Authorities related to project investments
        UserAuthority viewProjectInvestment = new UserAuthority( "AUTH|project_investment|view" );
        userAuthorityRepository.save( viewProjectInvestment );

        UserAuthority addProjectInvestment = new UserAuthority( "AUTH|project_investment|add" );
        userAuthorityRepository.save( addProjectInvestment );

        UserAuthority editProjectInvestment = new UserAuthority( "AUTH|project_investment|edit" );
        userAuthorityRepository.save( editProjectInvestment );

        UserAuthority deleteProjectInvestment = new UserAuthority( "AUTH|project_investment|delete" );
        userAuthorityRepository.save( deleteProjectInvestment );

        // Authorities related to client
        UserAuthority viewClient = new UserAuthority( "AUTH|client|view" );
        userAuthorityRepository.save( viewClient );

        UserAuthority addClient = new UserAuthority( "AUTH|client|add" );
        userAuthorityRepository.save( addClient );

        UserAuthority editClient = new UserAuthority( "AUTH|client|edit" );
        userAuthorityRepository.save( editClient );

        UserAuthority deleteClient = new UserAuthority( "AUTH|client|delete" );
        userAuthorityRepository.save( deleteClient );

        // Authorities related to Messages
        UserAuthority viewMessage = new UserAuthority( "AUTH|message|view" );
        userAuthorityRepository.save( viewMessage );

        UserAuthority addMessage = new UserAuthority( "AUTH|message|add" );
        userAuthorityRepository.save( addMessage );

        UserAuthority editMessage = new UserAuthority( "AUTH|message|edit" );
        userAuthorityRepository.save( editMessage );

        UserAuthority deleteMessage = new UserAuthority( "AUTH|message|delete" );
        userAuthorityRepository.save( deleteMessage );

        // Authorities related to Message groups
        UserAuthority viewMessageGroup = new UserAuthority( "AUTH|message_group|view" );
        userAuthorityRepository.save( viewMessageGroup );

        UserAuthority addMessageGroup = new UserAuthority( "AUTH|message_group|add" );
        userAuthorityRepository.save( addMessageGroup );

        UserAuthority editMessageGroup = new UserAuthority( "AUTH|message_group|edit" );
        userAuthorityRepository.save( editMessageGroup );

        UserAuthority deleteMessageGroup = new UserAuthority( "AUTH|message_group|delete" );
        userAuthorityRepository.save( deleteMessageGroup );

        // Authorities related to payment
        UserAuthority viewPayment = new UserAuthority( "AUTH|payment|view" );
        userAuthorityRepository.save( viewPayment );

        UserAuthority addPayment = new UserAuthority( "AUTH|payment|add" );
        userAuthorityRepository.save( addPayment );

        UserAuthority editPayment = new UserAuthority( "AUTH|payment|edit" );
        userAuthorityRepository.save( editPayment );

        UserAuthority deletePayment = new UserAuthority( "AUTH|payment|delete" );
        userAuthorityRepository.save( deletePayment );

        // authorities : all
        UserAuthority viewAll = new UserAuthority( "AUTH|all|view" );
        userAuthorityRepository.save( viewAll );

        UserAuthority addAll = new UserAuthority( "AUTH|all|add" );
        userAuthorityRepository.save( addAll );

        UserAuthority editAll = new UserAuthority( "AUTH|all|edit" );
        userAuthorityRepository.save( editAll );

        UserAuthority deleteAll = new UserAuthority( "AUTH|all|delete" );
        userAuthorityRepository.save( deleteAll );

        // *****************************************************************
        /******************************************************************
         * ADDING SOME DEFAULT USER ROLES
         ******************************************************************/
        // *****************************************************************

        UserRole superAdmin = new UserRole();
        superAdmin.setName( "ROLE|Super Admin" );
        List<UserAuthority> authorities = new ArrayList<UserAuthority>();
        authorities.add( viewAll );
        authorities.add( addAll );
        authorities.add( deleteAll );
        authorities.add( editAll );
        superAdmin.setAuthorities( authorities );
        userRoleRepository.save( superAdmin );
        
        UserRole ordinaryAdmin = new UserRole();
        ordinaryAdmin.setName( "ROLE|Ordinary Admin" );
        List<UserAuthority> OAauthorities = new ArrayList<UserAuthority>();
        OAauthorities.add( viewAll );
        ordinaryAdmin.setAuthorities( OAauthorities );
        userRoleRepository.save( ordinaryAdmin );

        UserRole justUser = new UserRole();
        justUser.setName( "ROLE|User" );
        userRoleRepository.save( justUser );

        // *****************************************************************
        /******************************************************************
         * ADDING SOME DEFAULT USERS
         ******************************************************************/
        // *****************************************************************

        User admin = new User();
        admin.setFirstName( "Adam" );
        admin.setLastName( "Gilchrist" );
        admin.setEmail( "adamgilchrist@yahoo.com" );
        List<UserRole> roles = new ArrayList<UserRole>();
        roles.add( superAdmin );
        roles.add( justUser );
        admin.setRoles( roles );
        userRepository.save( admin );

        UserCredential credential = new UserCredential();
        credential.setUser( admin );
        credential.setUserName( "admin" );
        credential.setPassword( "admin" );
        credential.setChangedDate( new Date() );
        userCredentialRepository.save( credential );

        admin.setCurrentCredential( credential );
        userRepository.save( admin );

        // *******************************************************************

        User developer = new User();
        developer.setFirstName( "AB" );
        developer.setLastName( "Devilliers" );
        developer.setEmail( "abd@yahoo.com" );
        developer.setOffice( headOffice );
        List<UserRole> rolesD = new ArrayList<UserRole>();
        rolesD.add( justUser );
        developer.setRoles( rolesD );
        userRepository.save( developer );

        UserCredential credentialD = new UserCredential();
        credentialD.setUser( developer );
        credentialD.setUserName( "developer" );
        credentialD.setPassword( "developer" );
        credentialD.setChangedDate( new Date() );
        userCredentialRepository.save( credentialD );

        developer.setCurrentCredential( credentialD );
        userRepository.save( developer );

    }
}
