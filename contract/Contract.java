package com.example.policycreation.contract;

public class Contract {
    private int premiumfactor;
    private int partyid;

    public Contract() {
        super();
    }

    public Contract(int premiumfactor, int partyid) {
        this.premiumfactor = premiumfactor;
        this.partyid = partyid;
    }

    public int getPremiumfactor() {
        return premiumfactor;
    }

    public void setPremiumfactor(int premiumfactor) {
        this.premiumfactor = premiumfactor;
    }

    public int getPartyid() {
        return partyid;
    }

    public void setPartyid(int partyid) {
        this.partyid = partyid;
    }
}
