package org.example.domain;

public class Director {
    private int d_id;
    private String d_name;
    private String d_gender;

    public Director(int d_id, String d_name, String d_gender) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_gender = d_gender;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_gender() {
        return d_gender;
    }

    public void setD_gender(String d_gender) {
        this.d_gender = d_gender;
    }
}
