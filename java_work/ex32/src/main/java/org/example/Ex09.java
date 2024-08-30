package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
        List<Member> list = new ArrayList<>();
        try (Connection conn
                     = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pmh", "root", "1234")) {

            // 대문자 변환 단축키 컨트롤 쉬프트 U
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM bb ORDER BY IDX DESC");
            ResultSet rs = pstmt.executeQuery();

            while ((rs.next())) {
                Member member = Member.builder()
                        .name(rs.getString("name"))
                        .idx(rs.getInt("idx"))
                        .age(rs.getInt("age"))
                        .password(rs.getString("password"))
                        .regdate(rs.getObject("regdate", LocalDateTime.class))
                        .mydate(rs.getObject("mydate", LocalDateTime.class))
                        .build();
                list.add(member);
            }

            // 라이브러리 추가되어 있는지 확인
//            Class.forName("com.mysql.cj.jdbc.Driver");

            list.stream()
                    .forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
