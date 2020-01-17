package com.mydb;

public class School {
    private int id;
    private String schlName;
    private String district;
    private double rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchlName() {
        return schlName;
    }

    public void setSchlName(String schlName) {
        this.schlName = schlName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
