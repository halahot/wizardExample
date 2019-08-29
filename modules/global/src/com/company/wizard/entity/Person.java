package com.company.wizard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "WIZARD_PERSON")
@Entity(name = "wizard_Person")
public class Person extends StandardEntity
{
    private static final long serialVersionUID = -7283035806635541013L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "LAST_NAME")
    protected String lastName;

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}