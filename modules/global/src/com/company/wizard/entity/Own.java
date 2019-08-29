package com.company.wizard.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "WIZARD_OWN")
@Entity(name = "wizard_Own")
public class Own extends StandardEntity
{
    private static final long serialVersionUID = 2820859980099634412L;

    @Column(name = "EQUTIY")
    protected String equtiy;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "own")
    protected List<OwnDocument> documents;

    public List<OwnDocument> getDocuments()
    {
        return documents;
    }

    public void setDocuments(List<OwnDocument> documents)
    {
        this.documents = documents;
    }

    public String getEqutiy()
    {
        return equtiy;
    }

    public void setEqutiy(String equtiy)
    {
        this.equtiy = equtiy;
    }
}