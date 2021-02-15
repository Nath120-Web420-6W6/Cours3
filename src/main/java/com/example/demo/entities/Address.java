package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "address")
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district")
    private String district;

    @Column(name = "city_id")
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private City cityId;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private byte[] location;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;


    public Address(Short addressId) {
        this.addressId = addressId;
    }

    public Address(Short addressId, String address, String district, String phone, byte[] location, java.sql.Timestamp lastUpdate) {
        this.addressId = addressId;
        this.address = address;
        this.district = district;
        this.phone = phone;
        this.location = location;
        this.lastUpdate = lastUpdate;
    }




    public int getAddressId() {
        return this.addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCityId() {
        return this.cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getLocation() {
        return this.location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
