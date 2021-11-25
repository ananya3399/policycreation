package com.example.policycreation.property;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int propertyid;

    @NotBlank(message = "Property Code mandatory")
    private String propertycode;

    @NotBlank(message = "Property Type mandatory")
    private String propertytype;

    @NotBlank(message = "Vehicle Brand mandatory")
    private String vehiclebrand;

    private String vehiclemodel;
    private int buildyear;
    private String fueltypes;
    private String enginepower;

    @NotBlank(message = "License Number mandatory")
    private String licenseplatenumber;

    private String vusage;

    @Positive(message = "Mileage should be positive")
    private int mileage;

    private String mileageunit;

    public Property() {
        super();
    }

    public Property(int propertyid, String propertycode, String propertytype, String vehiclebrand, String vehiclemodel, int buildyear, String fueltypes, String enginepower, String licenseplatenumber, String vusage, int mileage, String mileageunit, int propertyfactor) {
        this.propertyid = propertyid;
        this.propertycode = propertycode;
        this.propertytype = propertytype;
        this.vehiclebrand = vehiclebrand;
        this.vehiclemodel = vehiclemodel;
        this.buildyear = buildyear;
        this.fueltypes = fueltypes;
        this.enginepower = enginepower;
        this.licenseplatenumber = licenseplatenumber;
        this.vusage = vusage;
        this.mileage = mileage;
        this.mileageunit = mileageunit;
    }

    public Property(String propertycode, String propertytype, String vehiclebrand, String vehiclemodel, int buildyear, String fueltypes, String enginepower, String licenseplatenumber, String vusage, int mileage, String mileageunit) {
        this.propertycode = propertycode;
        this.propertytype = propertytype;
        this.vehiclebrand = vehiclebrand;
        this.vehiclemodel = vehiclemodel;
        this.buildyear = buildyear;
        this.fueltypes = fueltypes;
        this.enginepower = enginepower;
        this.licenseplatenumber = licenseplatenumber;
        this.vusage = vusage;
        this.mileage = mileage;
        this.mileageunit = mileageunit;
    }

    public int getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(int propertyid) {
        this.propertyid = propertyid;
    }

    public String getPropertycode() {
        return propertycode;
    }

    public void setPropertycode(String propertycode) {
        this.propertycode = propertycode;
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    public String getVehiclebrand() {
        return vehiclebrand;
    }

    public void setVehiclebrand(String vehiclebrand) {
        this.vehiclebrand = vehiclebrand;
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    public int getBuildyear() {
        return buildyear;
    }

    public void setBuildyear(int buildyear) {
        this.buildyear = buildyear;
    }

    public String getFueltypes() {
        return fueltypes;
    }

    public void setFueltypes(String fueltypes) {
        this.fueltypes = fueltypes;
    }

    public String getEnginepower() {
        return enginepower;
    }

    public void setEnginepower(String enginepower) {
        this.enginepower = enginepower;
    }

    public String getLicenseplatenumber() {
        return licenseplatenumber;
    }

    public void setLicenseplatenumber(String licenseplatenumber) {
        this.licenseplatenumber = licenseplatenumber;
    }

    public String getVusage() {
        return vusage;
    }

    public void setVusage(String vusage) {
        this.vusage = vusage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getMileageunit() {
        return mileageunit;
    }

    public void setMileageunit(String mileageunit) {
        this.mileageunit = mileageunit;
    }

}
