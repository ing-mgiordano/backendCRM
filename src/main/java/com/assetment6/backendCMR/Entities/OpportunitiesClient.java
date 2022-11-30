package com.assetment6.backendCMR.Entities;

import java.util.List;

public class OpportunitiesClient {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String num;
    private Boolean isClient;
    private Boolean isDelete;
    private List<Contact> contacts;
    private String taxCode;
    
    public OpportunitiesClient(int id, String name, String surname, String email, String num, Boolean isClient,
            Boolean isDelete, List<Contact> contacts, String taxCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.num = num;
        this.isClient = isClient;
        this.isDelete = isDelete;
        this.contacts = contacts;
        this.taxCode = taxCode;
    }

    public OpportunitiesClient() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Boolean getIsClient() {
        return isClient;
    }

    public void setIsClient(Boolean isClient) {
        this.isClient = isClient;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    
        public String getTaxCode() {
            return taxCode;
        }
    
        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;

        }

    @Override
    public String toString() {
        return "OpportunitiesClient [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
                + ", num=" + num + ", isClient=" + isClient + ", isDelete=" + isDelete + ", contacts=" + contacts
                + ", taxCode=" + taxCode + "]";
    }

}
