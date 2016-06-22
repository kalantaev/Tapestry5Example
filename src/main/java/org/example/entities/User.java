package org.example.entities;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Kalantaev Alexandr on 22.06.2016.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonVisual
    public Long id;
    @Validate("required, minLength=5")
    public String login;
    @Validate("required")
    public String password;
    public Date dateRegistration;
    public Date dateLastVizit;




}
