package com.example.medic.models;

import java.util.ArrayList;

public class Doctor {
    String name;
    ArrayList<String> comments;
    int rating;
    String desc;
    String specialization;
    ArrayList<String> practiceInn;

    public Doctor(){};

    public Doctor(String n, ArrayList<String> comm, int rat, String de, String spec, ArrayList<String> pi ){
        name = n;
        comments =comm;
        rating = rat;
        desc = de;
        specialization = spec;
        practiceInn = pi;
    }

    public void setter(String n, ArrayList<String> comm, int rat, String de, String spec, ArrayList<String> pi ){
        name = n;
        comments =comm;
        rating = rat;
        desc = de;
        specialization = spec;
        practiceInn = pi;
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

    public ArrayList<String> getPracticeInn() {
        return practiceInn;
    }
}
