/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtech.antm;

/**
 *
 * @author Godwin Agada
 */
public class ScoutingVenue {
    private String address;
    private String country;
    private String date;
    private double lattitude;
    private double longitude;

    /**
     * @return the address
     * the address of the scouting date
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     * set the address to a particular value
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the lattitude
     */
    public double getLattitude() {
        return lattitude;
    }

    /**
     * @param lattitude the lattitude to set
     */
    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public ScoutingVenue(String address, String country, String date, double latt, double lon){
        this.address = address;
        this.country = country;
        this.date = date;
        this.lattitude = latt;
        this.longitude = lon;        
    }
}
