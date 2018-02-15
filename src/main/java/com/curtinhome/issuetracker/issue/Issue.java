package com.curtinhome.issuetracker.issue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private int status;
    private long owner;
    private long tenant;

    protected Issue() {}

    public Issue(String name, String description) {
        this.name=name;
        this.description=description;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getOwner() {
        return owner;
    }

    public long getTenant() {
        return tenant;
    }
}
