package org.example.domain;

public class Actor {
    private int a_id;
    private String a_name;
    private String a_gender;

    public Actor(int a_id, String a_name, String a_gender) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.a_gender = a_gender;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_gender() {
        return a_gender;
    }

    public void setA_gender(String a_gender) {
        this.a_gender = a_gender;
    }
}
