package org.example.domain;

import java.util.Date;

public class Movie {
    private int m_id;
    private String m_name;
    private String m_genre;
    private String o_date;
    private String outline;

    public Movie(int m_id, String m_name, String m_genre, String o_date, String outline) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_genre = m_genre;
        this.o_date = o_date;
        this.outline = outline;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_genre() {
        return m_genre;
    }

    public void setM_genre(String m_genre) {
        this.m_genre = m_genre;
    }

    public String getO_date() {
        return o_date;
    }

    public void setO_date(String o_date) {
        this.o_date = o_date;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }
}