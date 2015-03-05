package org.hisp.pmt.controller.user;

import org.hisp.pmt.service.user.CommonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindUserController
{
    @Autowired
    private CommonUserService userService;

    /*
     * TO view All users
     */
    @RequestMapping( "/users" )
    public String allUsers( Model model )
    {
        model.addAttribute( "users", userService.findAll() );
        return "userHome";
    }

    /*
     * TO get all users as list
     */
    @RequestMapping( "/getAllUserObjectsAsList" )
    public String getAllUserObjectsAsList( Model model )
    {
        model.addAttribute( "allusers", userService.findAll() );
        return "browseUsersDialogData";
    }

    /*
     * To view a certain user with id
     */

    @RequestMapping( "/users/{id}" )
    public String details( Model model, @PathVariable Integer id )
    {
        model.addAttribute( "user", userService.findOne( id ) );
        return "userInfo";
    }

    /*
     * TO get all user roles as list
     */
    @RequestMapping( "/getAllUserRoleObjectsAsList" )
    public String getAllUserRoleObjectsAsList( Model model, @RequestParam Integer uId )
    {
        model.addAttribute( "allUserRoles", userService.findAllUserRoles() );
        model.addAttribute( "selectedRoles", userService.findOne( uId ).getRoles() );
        return "browseUserRolesDialogData";
    }
}
