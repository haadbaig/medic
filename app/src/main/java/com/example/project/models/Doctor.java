package com.example.project.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Doctor implements Serializable {
    String name;
    ArrayList<String> comments;
    int rating;
    String desc;
    String specialization;

    public Doctor(){};

    public Doctor(String n, ArrayList<String> comm, int rat, String de, String spec ){
        name = n;
        comments =comm;
        rating = rat;
        desc = de;
        specialization = spec;
    }

    public void setter(String n, ArrayList<String> comm, int rat, String de, String spec ){
        name = n;
        comments =comm;
        rating = rat;
        desc = de;
        specialization = spec;
    }


    public String getName() {
        return name;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public int getRating() {
        return rating;
    }

    public String getDesc() {
        return desc;
    }

    public String getSpecialization() {
        return specialization;
    }

}
