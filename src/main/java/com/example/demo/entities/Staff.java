package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable  {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address_id")
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address addressId;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "email")
    private String email;

    @Column(name = "store_id")
    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store storeId;

    @Column(name = "active")
    private Byte active;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;

    public int getStaffId() {
        return this.staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
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

    public Address getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public byte[] getPicture() {
        return this.picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Store getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public Byte getActive() {
        return this.active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
