package org.example;

class Board{}
class PBoard extends Board{}

public class Ex02 {
    public static void main(String[] args) {
        Board board = new PBoard();
        PBoard pBoard = (PBoard) new Board();



        System.out.println("success");
    }
}
