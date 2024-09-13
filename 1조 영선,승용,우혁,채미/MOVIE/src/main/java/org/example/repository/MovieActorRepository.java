package org.example.repository;

import org.example.service.AdminMain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static org.example.repository.connection.DBConnectionUtil.getConnection;

public class MovieActorRepository {
    AdminMain adminMain = new AdminMain();

    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scan = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection();
            pstmt = conn.prepareStatement(
                    "INSERT INTO movieActor(m_name, a_name) VALUES (?, ?)");

            String m_name = scan.next();
            pstmt.setString(1, m_name);
            String a_name = scan.next();
            pstmt.setString(2, a_name);

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

            pstmt = conn.prepareStatement("SELECT DISTINCT a.a_name FROM Movie m " +
                    "INNER JOIN MovieActor ma ON (ma.m_id = m.m_id) " +
                    "INNER JOIN Actor a ON (ma.a_id = a.a_id) " +
                    "WHERE a.a_name LIKE ?");

            pstmt2 = conn.prepareStatement("SELECT DISTINCT a.a_name, m.m_name, d.d_name, m.m_genre, m.o_date, m.outline " +
                    "FROM Movie m " +
                    "INNER JOIN MovieActor ma ON (ma.m_id = m.m_id) " +
                    "INNER JOIN Actor a ON (ma.a_id = a.a_id) " +
                    "INNER JOIN MovieDirector md ON (m.m_id = md.m_id) " +
                    "INNER JOIN Director d ON (md.d_id = d.d_id) " +
                    "WHERE a.a_name LIKE ?");

            while (true) {
                System.out.println("\n입력하시겠습니까?");
                System.out.println("""
                    1. 예
                    2. 아니오.
                    """);
                int cho = scan.nextInt();
                scan.nextLine(); // 입력 버퍼 비우기

                if (cho == 1) {
                    System.out.println("원하시는 배우 이름을 입력하세요.");
                    System.out.print("\uD83D\uDC69\uD83C\uDFFC 배우 이름 : ");
                    String a_name = scan.nextLine();
                    pstmt2.setString(1, "%" + a_name + "%");

                    rs2 = pstmt2.executeQuery();

                    String prevActorName = null;
                    while (rs2.next()) {
                        String actorName = rs2.getString("a_name");

                        if (!actorName.equals(prevActorName)) {
                            if (prevActorName != null) {
                                System.out.print("\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F");
                                System.out.print("\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F");
                                System.out.print("\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F\uD83C\uDF9E\uFE0F"+"\n");
                            }
                            System.out.println("\n배우 " + actorName + "이(가) 출연한 영화를 보여드리겠습니다.");
                            prevActorName = actorName;
                        }

                        System.out.printf("""
                                🍿제목 : %s
                                \uD83E\uDDD4\uD83C\uDFFB\uD83C\uDFAC감독 이름 : %s
                                📽️장르 : %s, 개봉일 : %s, 설명 : %s
                                %n""",
                                rs2.getString("m_name"),
                                rs2.getString("d_name"),
                                rs2.getString("m_genre"),
                                rs2.getString("o_date"),
                                rs2.getString("outline"));
                    }

                    if (prevActorName == null) { // 검색 결과가 없는 경우
                        System.out.println("검색 결과가 없습니다.");
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
                        "UPDATE MovieActor SET m_name = ?, a_name = ? where (m_id = ? and a_id = ?)");
                System.out.print("영화 이름 : ");
                String m_name = scan.next();
                pstmt.setString(1, m_name);
                System.out.println();
                System.out.print("배우 이름 : ");
                String d_name = scan.next();
                pstmt.setString(2, d_name);
                System.out.println();
                System.out.print("영화 아이디 : ");
                int m_id = scan.nextInt();
                pstmt.setInt(3, m_id);
                System.out.print("배우 아이디 : ");
                int a_id = scan.nextInt();
                pstmt.setInt(4, a_id);

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
                    "delete from MovieActor where m_id = ?");

            int m_id = scan.nextInt();
            pstmt.setInt(1, m_id);

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