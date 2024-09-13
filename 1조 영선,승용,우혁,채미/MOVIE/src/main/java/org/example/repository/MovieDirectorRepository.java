package org.example.repository;

import org.example.service.AdminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import static org.example.repository.connection.DBConnectionUtil.getConnection;

public class MovieDirectorRepository {
    AdminMain adminMain = new AdminMain();

    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            pstmt = conn.prepareStatement(
                    "INSERT INTO movieDirector(m_name, d_name) VALUES (?, ?)");

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
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();

            pstmt2 = conn.prepareStatement("SELECT m.m_id, m.m_name, d.d_name, m.m_genre, m.o_date, m.outline " +
                    "FROM Movie m " +
                    "INNER JOIN MovieDirector md ON (m.m_id = md.m_id) " +
                    "INNER JOIN Director d ON (md.d_id = d.d_id) " +
                    "WHERE d.d_name LIKE ?");

            pstmt = conn.prepareStatement("SELECT a.a_name " +
                    "FROM MovieActor ma " +
                    "INNER JOIN Actor a ON (ma.a_id = a.a_id) " +
                    "WHERE ma.m_id = ?");

            while (true) {
                System.out.println("\n입력하시겠습니까?");
                System.out.println("""
                    1. 예
                    2. 아니오.
                    """);
                int cho = scan.nextInt();
                scan.nextLine(); // 입력 버퍼 비우기

                if (cho == 1) {
                    System.out.println("원하시는 감독 이름을 입력하세요.");
                    System.out.print("\uD83E\uDDD4\uD83C\uDFFB\uD83C\uDFAC 감독 이름 : ");
                    String d_name = scan.nextLine();
                    pstmt2.setString(1, "%" + d_name + "%"); // LIKE 검색 추가

                    rs2 = pstmt2.executeQuery();
                    System.out.println();
                    boolean movieFound = false;
                    while (rs2.next()) {
                        movieFound = true;
                        int movieId = rs2.getInt("m_id");

                        System.out.printf("""
                                    🍿 제목 : %s
                                    📽️ 장르 : %s, 개봉일 : %s, 설명 : %s
                                    %n""",
                                rs2.getString("m_name"),
                                rs2.getString("m_genre"),
                                rs2.getString("o_date"),
                                rs2.getString("outline"));

                        pstmt.setInt(1, movieId);
                        rs = pstmt.executeQuery();
                        System.out.print("\uD83D\uDC69\uD83C\uDFFC 출연 배우 : ");
                        boolean firstActor = true;
                        while (rs.next()) {
                            if (!firstActor) {
                                System.out.print(", ");
                            }
                            System.out.print(rs.getString("a_name"));
                            firstActor = false;
                        }
                        System.out.print("\n\n\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F");
                        System.out.print("\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F");
                        System.out.print("\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F"+"\n");
                    }

                    if (!movieFound) {
                        System.out.println("""
                            죄송합니다.
                            검색 결과가 없습니다.
                            다시 입력해주시길 바랍니다.
                            """);
                    } else {
                        System.out.println("\n감독 " + d_name + "이(가) 촬영한 영화를 모두 보여드렸습니다.");
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

        int cho = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            System.out.println("""
                        수정 하시겠습니까?
                        1. 예
                        2. 아니오
                    """);
            cho = scan.nextInt();
            if (cho == 1) {
                pstmt = conn.prepareStatement(
                        "UPDATE MovieDirector SET m_name = ?, d_name = ? where m_id = ?");
                System.out.print("영화 이름 : ");
                String m_name = scan.next();
                pstmt.setString(1, m_name);
                System.out.println();
                System.out.print("감독 이름 : ");
                String d_name = scan.next();
                pstmt.setString(2, d_name);
                System.out.println();
                System.out.print("영화 아이디 : ");
                int m_id = scan.nextInt();
                pstmt.setInt(3, m_id);

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
                    "delete from MovieDirector where m_id = ?");

            int idx = scan.nextInt();
            pstmt.setInt(1, idx);

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