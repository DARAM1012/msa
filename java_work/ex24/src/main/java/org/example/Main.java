package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BoxFactory.<Integer>peekBox(new Box<>(10));
        BoxFactory.peekBox2(new Box<>(20));

//        SteelBox<String> steelBox = new SteelBox<>();
//        steelBox.setT("test");

//        System.out.println(steelBox.getT());
    }
}