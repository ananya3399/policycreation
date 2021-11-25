package com.example.policycreation.party;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

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
    private LocalDate birthdate;

    @Transient
    @Min(value = 18, message = "Age under 18")
    private int age;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<ContactChannel> contactChannels;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "partyid", referencedColumnName = "partyid")
    private List<Roles> roles;

    public Party() {
        super();
    }

    public Party(int partyid, int accountmanagernumber, String gender, String firstname, String lastname, LocalDate birthdate, List<Address> addresses, List<ContactChannel> contactChannels, List<Roles> roles) {
        this.partyid = partyid;
        this.accountmanagernumber = accountmanagernumber;
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.addresses = addresses;
        this.contactChannels = contactChannels;
        this.roles = roles;
    }

    public int getPartyid() {
        return partyid;
    }

    public void setPartyid(int partyid) {
        this.partyid = partyid;
    }

    public int getAccountmanagernumber() {
        return accountmanagernumber;
    }

    public void setAccountmanagernumber(int accountmanagernumber) {
        this.accountmanagernumber = accountmanagernumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthdate, now);
        Integer gap = Math.abs(period.getYears());
        this.age=gap;
        this.birthdate = birthdate;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<ContactChannel> getContactChannels() {
        return contactChannels;
    }

    public void setContactChannels(List<ContactChannel> contactChannels) {
        this.contactChannels = contactChannels;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Party{" +
                "partyid=" + partyid +
                ", accountmanagernumber=" + accountmanagernumber +
                ", gender='" + gender + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate=" + birthdate +
                ", addresses=" + addresses +
                ", contactChannels=" + contactChannels +
                ", roles=" + roles +
                '}';
    }
}
