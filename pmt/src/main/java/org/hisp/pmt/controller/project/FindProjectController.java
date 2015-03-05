package org.hisp.pmt.controller.project;

import org.hisp.pmt.api.project.Activity;
import org.hisp.pmt.api.project.Milestone;
import org.hisp.pmt.service.project.CommonProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FindProjectController
{
    @Autowired
    private CommonProjectService projectService;
    
    /*
     * TO view All projects
     */
    @RequestMapping("/projects")
    public String allUsers(Model model)
    {
        model.addAttribute( "projects",projectService.findAll() );
        return "allProjects";
    }
    
    /*
     * To view a certain user with id
     */
    
    @RequestMapping("/projects/{id}")
    public String details(Model model, @PathVariable Integer id)
    {
        System.out.print( projectService.findProjectById(id) );
        model.addAttribute( "project", projectService.findProjectById(id));
        model.addAttribute( "activities", projectService.findProjectById(id).getActivities());
        model.addAttribute( "milestones", projectService.findProjectById(id).getMilestones());
        model.addAttribute( "newActivity", new Activity());
        model.addAttribute( "newMilestone", new Milestone());
        return "projectInfo";
    }
}
