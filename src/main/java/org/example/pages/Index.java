package org.example.pages;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.entities.User;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Kalantaev Alexandr on 22.06.2016.
 */
public class Index {

    @Inject
    private Session session;
    public List<User> getUsers()
    {
        return session.createCriteria(User.class).list();
    }

}
