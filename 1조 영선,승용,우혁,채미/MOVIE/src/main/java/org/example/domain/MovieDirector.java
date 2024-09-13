package org.example.domain;

public class MovieDirector {
    private int m_id;
    private int d_id;
    private String m_name;
    private String d_name;

    public MovieDirector(int m_id, int d_id, String m_name, String d_name) {
        this.m_id = m_id;
        this.d_id = d_id;
        this.m_name = m_name;
        this.d_name = d_name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }
}
