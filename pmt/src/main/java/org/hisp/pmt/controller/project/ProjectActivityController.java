package org.hisp.pmt.controller.project;

import org.hisp.pmt.api.project.Activity;
import org.hisp.pmt.service.project.CommonProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectActivityController
{
    // ************************************************************************
    // Dependencies **********************************************************
    // ************************************************************************

    @Autowired
    private CommonProjectService projectService;

    /**
     * add activity action
     */
    @RequestMapping( "/addProjectActivityAction/{id}" )
    public String saveResisteredUser( @ModelAttribute( "newActivity" ) Activity addedActivity, @PathVariable Integer id )
    {
        projectService.addActivityToProject( projectService.findProjectById( id ), addedActivity );
        System.out.println( projectService.findProjectById( id ) );
        return "redirect:/projects/{id}.html";
    }
}
