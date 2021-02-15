package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "store")
@NoArgsConstructor
@AllArgsConstructor
public class Store implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;

    @Column(name = "manager_staff_id")
    private int managerStaffId;

    @Column(name = "address_id")
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address addressId;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;

    public int getStoreId() {
        return this.storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getManagerStaffId() {
        return this.managerStaffId;
    }

    public void setManagerStaffId(int managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Address getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
