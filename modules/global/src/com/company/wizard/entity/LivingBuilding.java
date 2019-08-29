package com.company.wizard.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "WIZARD_LIVING_BUILDING")
@Entity(name = "wizard_LivingBuilding")
public class LivingBuilding extends StandardEntity
{
    private static final long serialVersionUID = 5770134245286723042L;

    @Column(name = "ADDRESS")
    protected String address;

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}