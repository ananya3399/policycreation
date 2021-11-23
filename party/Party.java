package com.example.policycreation.party;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partyid")
    private int partyid;

    @Column(name = "accountmanagernumber")
    private int accountmanagernumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthdate")
    private String birthdate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<ContactChannel> contactChannels;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<Roles> roles;

}
