package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
public class City implements Serializable {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @Column(name = "city")
    private String city;

    @Column(name = "country_id")
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country countryId;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
