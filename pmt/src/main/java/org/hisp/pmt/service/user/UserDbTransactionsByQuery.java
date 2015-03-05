package org.hisp.pmt.service.user;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hisp.pmt.api.user.User;
import org.hisp.pmt.setting.SessionFactoryBuilder;

/**
 * This class includes all the users related database transactions that are done
 * by manual queries
 */
public class UserDbTransactionsByQuery
{

    // Preparing session for transactions
    private static SessionFactory sessionFactory = SessionFactoryBuilder.getSessionFactory();

    private static Session session = sessionFactory.getCurrentSession();

    // *****************************************************************************
    // FIND USERS
    // *****************************************************************************
    /**
     * Find Users by name : first name or last name
     */
    @SuppressWarnings( "unchecked" )
    public static List<User> findUsersByName( String name )
    {
        session.beginTransaction();
        Query query = session.createQuery( "from User where firstName like :name OR  lastName= :name" );
        query.setString( "name", name );

        return ((List<User>) query.uniqueResult());
    }

    /**
     * Find Users by address
     */
    @SuppressWarnings( "unchecked" )
    public static List<User> findUsersByAddress( String address )
    {
        session.beginTransaction();
        Query query = session.createQuery( "from User where address like :address" );
        query.setString( "address", address );

        return ((List<User>) query.uniqueResult());
    }

    /**
     * Find Users by email
     */
    @SuppressWarnings( "unchecked" )
    public static List<User> findUsersByEmail( String email )
    {
        session.beginTransaction();
        Query query = session.createQuery( "from User where email like :email" );
        query.setString( "email", email );

        return ((List<User>) query.uniqueResult());
    }

    /**
     * Find Users by contact number
     */
    @SuppressWarnings( "unchecked" )
    public static List<User> findUsersByContactNumber( String contactNumber )
    {
        session.beginTransaction();
        Query query = session.createQuery( "from User where contactNumber like :contactNumber" );
        query.setString( "contactNumber", contactNumber );

        return ((List<User>) query.uniqueResult());
    }

    /**
     * Find Users by remarks
     */
    @SuppressWarnings( "unchecked" )
    public static List<User> findUsersByRemarks( String remarks )
    {
        session.beginTransaction();
        Query query = session.createQuery( "from User where remarks like :remarks" );
        query.setString( "remarks", remarks );

        return ((List<User>) query.uniqueResult());
    }

}
