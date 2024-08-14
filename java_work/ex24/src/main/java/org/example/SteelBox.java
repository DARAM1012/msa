package org.example;

public class SteelBox <T> extends Box<T>{
    private T t;

    public SteelBox(T t) {
        super(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
