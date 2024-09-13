package org.example.domain;

public class MovieActor {
    private int m_id;
    private int a_id;
    private String m_name;
    private String a_name;

    public MovieActor(int m_id, int a_id, String m_name, String a_name) {
        this.m_id = m_id;
        this.a_id = a_id;
        this.m_name = m_name;
        this.a_name = a_name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }
}
