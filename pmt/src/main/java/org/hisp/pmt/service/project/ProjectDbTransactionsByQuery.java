package org.hisp.pmt.service.project;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hisp.pmt.api.project.Project;
import org.hisp.pmt.setting.SessionFactoryBuilder;

public class ProjectDbTransactionsByQuery
{

    // **************************************************************************************
    // Find projects by name
    // **************************************************************************************

    @SuppressWarnings( "unchecked" )
    @Transactional
    public static List<Project> findProjectLikeName( String name )
    {
        String hql = "FROM Project WHERE name like" + name;
        List<Project> projectList = new ArrayList<Project>();
        Session session = SessionFactoryBuilder.getSessionFactory().openSession();
        Query query = session.createQuery( hql );
        projectList = (List<Project>) query.list();

        return projectList;
    }

}
