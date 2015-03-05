package org.hisp.pmt.controller.project;

import org.hisp.pmt.api.project.Milestone;
import org.hisp.pmt.service.project.CommonProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectMilestoneController
{
    // ************************************************************************
    // Dependencies **********************************************************
    // ************************************************************************

    @Autowired
    private CommonProjectService projectService;

    /**
     * add activity action
     */
    @RequestMapping( "/addProjectMilestoneAction/{id}" )
    public String saveResisteredUser( @ModelAttribute( "newMilestone" ) Milestone addedMilestone, @PathVariable Integer id )
    {
        projectService.addMilestoneToProject( projectService.findProjectById( id ), addedMilestone );
        System.out.println( projectService.findProjectById( id ) );
        return "redirect:/projects/{id}.html";
    }
}
