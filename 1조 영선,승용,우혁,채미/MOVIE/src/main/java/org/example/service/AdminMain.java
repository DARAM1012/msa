package org.example.service;

import org.example.repository.*;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminMain {

    public void admin() {
        Scanner scan = new Scanner(System.in);
        MovieRepository movieRepository = new MovieRepository();
        ActorRepository actorRepository = new ActorRepository();
        MovieDirectorRepository movieDirectorRepository = new MovieDirectorRepository();
        MovieActorRepository movieActorRepository = new MovieActorRepository();

        while (true) {
            System.out.println("""
                    관리 테이블 정하기
                    1. 영화
                    2. 배우
                    3. 감독
                    4. 배우별 영화
                    5. 감독별 영화
                    0. 로그아웃
                    """);
            int res = scan.nextInt();
            if (res == 1) {
                movie();
            } else if (res == 2) {
                actor();
            } else if (res == 3) {
                director();
            } else if (res == 4) {
                movieActor();
            } else if (res == 5) {
                movieDirector();
            } else if (res == 0) {
                System.out.println("""
                        이용해 주셔서 감사합니다.
                        로그아웃 합니다.
                        """);
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }

    public static void movie() {
        Scanner scan = new Scanner(System.in);
        MovieRepository movieRepository = new MovieRepository();
        while (true) {
            System.out.println("""
                    1. 입력
                    2. 제목 조회
                    3. 장르 조회
                    4. 수정
                    5. 삭제
                    0. 종료
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                movieRepository.insert();
            } else if (cho == 2) {
                movieRepository.titleSelect();
            } else if (cho == 3) {
                movieRepository.genreSelect();
            } else if (cho == 4) {
                movieRepository.update();
            } else if (cho == 5) {
                movieRepository.delete();
            } else if (cho == 0) {
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }

    public static void actor() {
        Scanner scan = new Scanner(System.in);
        ActorRepository actorRepository = new ActorRepository();
        while (true) {
            System.out.println("""
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    0. 종료
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                actorRepository.insert();
            } else if (cho == 2) {
                actorRepository.select();
            } else if (cho == 3) {
                actorRepository.update();
            } else if (cho == 4) {
                actorRepository.delete();
            } else if (cho == 0) {
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }

    public static void director() {
        Scanner scan = new Scanner(System.in);
        DirectorRepository directorRepository = new DirectorRepository();
        while (true) {
            System.out.println("""
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    0. 종료
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                directorRepository.insert();
            } else if (cho == 2) {
                directorRepository.select();
            } else if (cho == 3) {
                directorRepository.update();
            } else if (cho == 4) {
                directorRepository.delete();
            } else if (cho == 0) {
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }

    public static void movieActor() {
        Scanner scan = new Scanner(System.in);
        MovieActorRepository movieActorRepository = new MovieActorRepository();
        while (true) {
            System.out.println("""
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    0. 종료
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                movieActorRepository.insert();
            } else if (cho == 2) {
                movieActorRepository.select();
            } else if (cho == 3) {
                movieActorRepository.update();
            } else if (cho == 4) {
                movieActorRepository.delete();
            } else if (cho == 0) {
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }

    public static void movieDirector() {
        Scanner scan = new Scanner(System.in);
        MovieDirectorRepository movieDirectorRepository = new MovieDirectorRepository();
        while (true) {
            System.out.println("""
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    0. 종료
                    """);
            int cho = scan.nextInt();
            if (cho == 1) {
                movieDirectorRepository.insert();
            } else if (cho == 2) {
                movieDirectorRepository.select();
            } else if (cho == 3) {
                movieDirectorRepository.update();
            } else if (cho == 4) {
                movieDirectorRepository.delete();
            } else if (cho == 0) {
                break;
            } else {
                System.out.println("""
                        없는 선택지입니다.
                        다시 입력해주시기 바랍니다.
                        """);
            }
        }
    }
}