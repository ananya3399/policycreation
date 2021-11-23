package com.example.policycreation.party;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contactchannel")
public class ContactChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactid")
    private int contactid;

    @Column(name = "preferred")
    private boolean preferred;

    @Column(name = "phonenumber")
    private String phonenumber;

    @Column(name = "contactchannelnumber")
    private String contactchanneltype;

}
