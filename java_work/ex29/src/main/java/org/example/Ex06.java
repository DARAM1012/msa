package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        MemberDBRespository memberDBRespository = new MemberDBRespository();

        List<Member> list = memberDBRespository.select();


        list.stream()
                .forEach(System.out::println);

        //        list.stream().forEach(s -> System.out.println(s));
    }

}

