package com.example.policycreation.party;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressid")
    private int addressid;

    @Column(name = "city")
    private String city;

    @Column(name = "countrycode")
    private String countrycode;

    @Column(name = "postcode")
    @Positive(message = "Postcode should be numeric")
    private int postcode;

    @Column(name = "street")
    private String street;

    @Column(name = "streetnumber")
    private int streetnumber;

    @Column(name = "type")
    private String type;

    public Address() {
        super();
    }

    public Address(int addressid, String city, String countrycode, int postcode, String street, int streetnumber, String type) {
        this.addressid = addressid;
        this.city = city;
        this.countrycode = countrycode;
        this.postcode = postcode;
        this.street = street;
        this.streetnumber = streetnumber;
        this.type = type;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(int streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", city='" + city + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", postcode=" + postcode +
                ", street='" + street + '\'' +
                ", streetnumber=" + streetnumber +
                ", type='" + type + '\'' +
                '}';
    }
}
