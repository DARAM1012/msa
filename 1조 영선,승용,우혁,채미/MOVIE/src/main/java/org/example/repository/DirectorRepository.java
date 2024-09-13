package org.example.repository;

import org.example.service.AdminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import static org.example.repository.connection.DBConnectionUtil.getConnection;

public class DirectorRepository {
    AdminMain adminMain = new AdminMain();

    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            pstmt = conn.prepareStatement(
                    "INSERT INTO Director(d_name, d_gender) VALUES (?, ?)");

            String m_name = scan.next();
            pstmt.setString(1, m_name);
            String d_name = scan.next();
            pstmt.setString(2, d_name);

            pstmt.executeUpdate();
            adminMain.admin();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void select() {
        Connection conn;
        PreparedStatement pstmt;
        ResultSet rs;
        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            pstmt = conn.prepareStatement
                    ("select * from Director where d_name like (?)");

            while (true) {
                System.out.println("입력하시겠습니까?");
                System.out.println("""
                        1. 예
                        2. 아니오.
                        """);
                int cho = scan.nextInt();
                scan.nextLine(); // 입력 버퍼 비우기
                if (cho == 1) {
                    System.out.println("원하시는 감독 이름을 입력하세요.");
                    System.out.print("감독 이름 : ");
                    String d_name = scan.nextLine();
                    pstmt.setString(1, d_name);

                    rs = pstmt.executeQuery();

                    boolean row = true;
                    while (rs.next()) {
                        row = false;
                        System.out.printf("""
                                        이름 : %s, 성별 : %s
                                        %n""",

                                rs.getString("d_name"),
                                rs.getString("d_gender"));
                    }
                    if (row) {
                        System.out.println("""
                                죄송합니다.
                                검색하신 감독은 없는 감독입니다.
                                다시 입력해주시길 바랍니다.
                                """);
                    }
                } else if (cho == 2) {
                    System.out.println("뒤로 돌아갑니다.");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            System.out.println("""
                        수정 하시겠습니까?
                        1. 예
                        2. 아니오
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                pstmt = conn.prepareStatement(
                        "UPDATE Director SET d_name = ?, d_gender = ? where d_id = ?");

                System.out.print("감독 이름 : ");
                String d_name = scan.next();
                pstmt.setString(1, d_name);
                System.out.println();
                System.out.print("감독 성별 : ");
                String d_gender = scan.next();
                pstmt.setString(2, d_gender);

                pstmt.executeUpdate();
                adminMain.admin();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void delete() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();

            pstmt = conn.prepareStatement(
                    "delete from Director where d_id = ?");

            int d_id = scan.nextInt();
            pstmt.setInt(1, d_id);

            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
            }
        }
    }
}