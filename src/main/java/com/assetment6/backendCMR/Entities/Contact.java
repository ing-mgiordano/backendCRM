package com.assetment6.backendCMR.Entities;

import java.time.LocalDate;

public class Contact {
    private int id;
    private String wayContac;
    private LocalDate date;
    private String summary;

    public Contact(int id, String wayContac, LocalDate date, String summary) {
        this.id = id;
        this.wayContac = wayContac;
        this.date = date;
        this.summary = summary;
    }

    public Contact() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWayContac() {
        return wayContac;
    }

    public void setWayContac(String wayContac) {
        this.wayContac = wayContac;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", wayContac=" + wayContac + ", date=" + date + ", summary=" + summary + "]";
    }

}

