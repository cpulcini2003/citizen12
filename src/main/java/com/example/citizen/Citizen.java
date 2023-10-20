package com.example.citizen;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate dateOfBirth;
    String firstname;
    String lastname;
    String fiscalId;
  

    //CONSTRUCTORS

    public Citizen() {}

    public Citizen(
            Long id,
            LocalDate dateOfBirth,
            String firstname,
            String lastname,
            String fiscalId
            ) {
                this.id = id;
                this.dateOfBirth = dateOfBirth;
                this.firstname = firstname;
                this.lastname = lastname;
                this.fiscalId = fiscalId;
            }

    public Citizen(
            LocalDate dateOfBirth,
            String firstname,
            String lastname,
            String fiscalId
            ) {
                this.dateOfBirth = dateOfBirth;
                this.firstname = firstname;
                this.lastname = lastname;
                this.fiscalId = fiscalId;
            }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String setLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFiscalId() {
        return fiscalId;
    }

    public void setFiscalId(String fiscalId) {
        this.fiscalId = fiscalId;
    }

    @Override
    public String toString() {
        return "Citizen [id=" + id + ", dateOfBirth=" + dateOfBirth + ", firstname=" + firstname + ", lastname="
                + lastname + ", fiscalId=" + fiscalId + "]";
    }


}

