package org.example.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.entities.User;
import org.hibernate.Session;

import java.util.Date;


/**
 * Created by Kalantaev Alexandr on 22.06.2016.
 */
public class SignUp {

    @Property
    private User user;
    @Inject
    private Session session;

    @InjectPage
    private Index index;

    @CommitAfter
    Object onSuccess()
    {
        user.dateRegistration = new Date();
        session.persist(user);

        return index;
    }
}
