package com.example.policycreation.party;

import javax.persistence.*;
import javax.validation.constraints.Positive;

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
    @Positive(message = "Phone number should be numeric")
    private int phonenumber;

    @Column(name = "contactchanneltype")
    private String contactchanneltype;

    public ContactChannel() {
        super();
    }

    public ContactChannel(int contactid, boolean preferred, int phonenumber, String contactchanneltype) {
        this.contactid = contactid;
        this.preferred = preferred;
        this.phonenumber = phonenumber;
        this.contactchanneltype = contactchanneltype;
    }

    public int getContactid() {
        return contactid;
    }

    public void setContactid(int contactid) {
        this.contactid = contactid;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getContactchanneltype() {
        return contactchanneltype;
    }

    public void setContactchanneltype(String contactchanneltype) {
        this.contactchanneltype = contactchanneltype;
    }

    @Override
    public String toString() {
        return "ContactChannel{" +
                "contactid=" + contactid +
                ", preferred=" + preferred +
                ", phonenumber=" + phonenumber +
                ", contactchanneltype='" + contactchanneltype + '\'' +
                '}';
    }
}
