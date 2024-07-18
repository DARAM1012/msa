package org.example.aa;

public class Box {

    private String conts;

    public Box(String cont){
        this.conts = cont;
    }

    @Override
    public String toString() {
        return "Box{" +
                "conts='" + conts + '\'' +
                '}';
    }
}

