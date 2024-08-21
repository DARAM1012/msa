package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {                                                     

    private DBRepository dbRepository = new DBRepository();

    public Main(){
        List<Member> list = dbRepository.select();
        System.out.println(list);

    }

    public static void main(String[] args) {

        new Main();
    }
}