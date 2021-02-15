package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "actor")
@NoArgsConstructor
@AllArgsConstructor
public class Actor implements Serializable {
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorId;

    @Column(name = "first_name")
    @Size(min = 2, max = 50)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_update")
    @Basic(optional = false)
    private java.sql.Timestamp lastUpdate;

    public int getActorId() {
        return this.actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
