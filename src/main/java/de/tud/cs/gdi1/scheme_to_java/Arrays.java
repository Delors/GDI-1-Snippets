package de.tud.cs.gdi1.scheme_to_java;

import java.util.Random;

public class Arrays {

    public static void init(int[] board) {
        Random rng = new Random();
        int i = 0;
        do {
            board[i] = rng.nextInt(3);
            if (i < 7 || i >= 56)
                i++;
            else
                i = 7 * 8;
        } while (i < board.length);
    }

    public static void print(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 8 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] board = new int[64]; // size 8 x 8
        init(board);
        print(board);
    }

}