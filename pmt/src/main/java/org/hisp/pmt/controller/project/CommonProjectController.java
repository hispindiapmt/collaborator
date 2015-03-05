package org.hisp.pmt.controller.project;

import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.service.project.CommonProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonProjectController
{
    @Autowired
    private CommonProjectService projectService;
    
    /** ********************************************************************
     *  ADD PROJECT
     **********************************************************************/
    /*
     * Add project form
     */
    @RequestMapping( "/addProject" )
    public String addProjectForm()
    {
        return "addProject";
    }

    /*
     * Model for add project form
     */
    @ModelAttribute( "project" )
    public Project construct(Model sample)
    {
        return new Project();
    }

    /*
     * add project action
     */
    @RequestMapping("/addProjectAction")
    public String saveResisteredUser( @ModelAttribute( "project" ) Project addedProject )
    {
        projectService.AddProject( addedProject );
        return "redirect:/projects.html";
    }
    
    /** ******************************************************************** 
     *  EDIT PROJECT
     **********************************************************************/
    
    /*
     * Form to edit a certain project with id
     */
    @RequestMapping("/editProject/{id}")
    public String editproject(Model model, @PathVariable Integer id)
    {
        model.addAttribute( "projectEdit", projectService.findProjectById( id ));
        return "editProject";
    }
    
    /*
     * Editing Action
     */
    @RequestMapping("/saveEditedProject**")
    public String editProjectAction( @ModelAttribute( "project" ) Project editedproject)
    {
        projectService.saveProject( editedproject );
        return "redirect:/projects.html";
    }
    
    /** ******************************************************************** 
     *  DELETE PROJECT
     **********************************************************************/
    /*
     * Delete a project with certain id
     */
    @RequestMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable Integer id)
    {
        projectService.deleteProject( projectService.findProjectById( id ) );
        return "redirect:/projects.html";
    }
}
