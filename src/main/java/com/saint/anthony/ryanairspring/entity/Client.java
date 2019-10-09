package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class Client extends IdHolder{

    private String firstName;
    private String middleName;
    private String lastName;
    private Long phone;
    private String email;
    private String passport;
    private String iataCountryCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getIataCountryCode() {
        return iataCountryCode;
    }

    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + super.getId() +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", passport='" + passport + '\'' +
                ", iataCountryCode='" + iataCountryCode + '\'' +
                '}';
    }
}