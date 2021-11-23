package com.example.policycreation.party;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String postcode;

    @Column(name = "street")
    private String street;

    @Column(name = "streetnumber")
    private int streetnumber;

    @Column(name = "type")
    private String type;

}
