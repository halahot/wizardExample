package com.company.wizard.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "WIZARD_OWN_DOCUMENT")
@Entity(name = "wizard_OwnDocument")
public class OwnDocument extends StandardEntity
{
    private static final long serialVersionUID = -6451418784509886986L;

    @Column(name = "SERIAL")
    protected String serial;

    @Column(name = "NUMBER_")
    protected String number;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWN_ID")
    protected Own own;

    public Own getOwn()
    {
        return own;
    }

    public void setOwn(Own own)
    {
        this.own = own;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getSerial()
    {
        return serial;
    }

    public void setSerial(String serial)
    {
        this.serial = serial;
    }
}