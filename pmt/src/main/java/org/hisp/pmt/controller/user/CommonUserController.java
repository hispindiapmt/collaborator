package org.hisp.pmt.controller.user;

import java.security.Principal;

import org.hisp.pmt.api.user.User;
import org.hisp.pmt.service.user.CommonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonUserController
{
    @Autowired
    private CommonUserService userService;
    
    
    /**
     * Session User
     */
    @RequestMapping( "/currentUser" )
    @ResponseBody
    public String currentUser(Model model, Principal activeUser)
    {
        String uName = activeUser.getName();
        model.addAttribute( "currentUser", userService.findUserByUserName( uName ) );
        return userService.findUserByUserName( uName ).getFirstName();
    }
    
    /**
     * Signup form
     */
    @RequestMapping( "/signup" )
    public String signUpForm()
    {
        return "signup";
    }

    /**
     * Model for signup form
     */
    @ModelAttribute( "user" )
    public User construct()
    {
        return new User();
    }

    /**
     * do sign up
     */
    @RequestMapping("/doSignup")
    public String saveResisteredUser( @ModelAttribute( "user" ) User registeredUser )
    {
        userService.addUser( registeredUser );
        return "redirect:/users.html";
    }
    
    /*
     * Form to edit a certain user with id
     */
    @RequestMapping("/editUser/{id}")
    public String editUser(Model model, @PathVariable Integer id)
    {
        model.addAttribute( "userEdit", userService.findOne(id));
        return "editUser";
    }
    
    /*
     * Editing Action
     */
    @RequestMapping("/saveEdit**")
    public String editUser( @ModelAttribute( "user" ) User editeduser)
    {
        userService.saveUser( editeduser );
        return "redirect:/users.html";
    }
    
    /*
     * Editing User Roles form
     */
    @RequestMapping("/editUserRoles**")
    public String editUserRolesForm()
    {
        return "editUserRoles";
    }
    
    /*
     * add a User Role to a user
     */
    @RequestMapping("/addUserRolesToUser")
    @ResponseBody
    public void addUserRolesToUser(@RequestParam Integer roleId , @RequestParam Integer userId)
    {
        userService.addUserRoleToUser(userId,roleId);
    }
    
    /*
     * remove a User Role from a user
     */
    @RequestMapping("/removeUserRoleFromUser")
    @ResponseBody
    public void removeUserRoleFromUser(@RequestParam Integer roleId , @RequestParam Integer userId)
    {
        userService.removeUserRoleFromUser(userId,roleId);
    }
    
    /*
     * Delete a user with certain id
     */
    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id)
    {
        userService.deleteUser( userService.findOne(id) );
        return "redirect:/users.html";
    }
}
