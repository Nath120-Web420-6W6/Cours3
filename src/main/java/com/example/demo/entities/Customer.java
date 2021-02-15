package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "store_id")
    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store storeId;

    @Column(name = "first_name")
    @Size(min = 5, max = 50)
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 5, max = 50)
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address_id")
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address addressId;

    @Column(name = "active")
    private Byte active;

    @Column(name = "create_date")
    @Basic(optional = false)
    private java.sql.Timestamp createDate;

    @Column(name = "last_update")
    @Basic(optional = false)
    private java.sql.Timestamp lastUpdate;

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Store getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Byte getActive() {
        return this.active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public java.sql.Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.sql.Timestamp createDate) {
        this.createDate = createDate;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", storeId=" + storeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressId=" + addressId +
                ", active=" + active +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
