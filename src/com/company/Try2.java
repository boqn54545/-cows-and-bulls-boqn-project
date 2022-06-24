package com.company;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Try2 {
    public static boolean checkIfDuplicatePl2Input(int fd1, int fd2, int fd3, int fd4) {
        return fd1 == fd3 || fd2 == fd1 || fd3 == fd2 || fd4 == fd1 || fd4 == fd2 || fd4 == fd3;
    }

    public static int checkIfBullsPl2(int fd1, int fd2, int fd3, int fd4, int f1, int f2, int f3, int f4) {
        int score = 0;
        if (fd1 == f1) {
            score = score + 1;
        }
        if (fd2 == f2) {

            score = score + 1;
        }
        if (fd3 == f3) {
            score = score + 1;
        }
        if (fd4 == f4) {
            score = score + 1;
        }
        return score;
    }

    public static int checkCowsPl2(int fd1, int fd2, int fd3, int fd4, int f1, int f2, int f3, int f4) {
        int score2 = 0;
        if (f1 == fd2 || f1 == fd3 || f1 == fd4) {
            score2 = score2 + 1;
        }
        if (f2 == fd1 || f2 == fd3 || f2 == fd4) {
            score2 = score2 + 1;
        }
        if (f3 == fd1 || f3 == fd2 || f3 == fd4) {
            score2 = score2 + 1;
        }
        if (f4 == fd1 || f4 == fd2 || f4 == fd3) {
            score2 = score2 + 1;
        }
        return score2;
    }

    public static boolean checkIfDuplicatePlInput(int rd1, int rd2, int rd3, int rd4) {
        return rd1 == rd3 || rd2 == rd1 || rd3 == rd2 || rd4 == rd1 || rd4 == rd2 || rd4 == rd3;
    }

    public static int checkIfBulls(int rd1, int rd2, int rd3, int rd4, int d1, int d2, int d3, int d4) {
        int score = 0;
        if (rd1 == d1) {
            score = score + 1;
        }
        if (rd2 == d2) {

            score = score + 1;
        }
        if (rd3 == d3) {
            score = score + 1;
        }
        if (rd4 == d4) {
            score = score + 1;
        }
        return score;
    }

    public static int checkCows(int rd1, int rd2, int rd3, int rd4, int d1, int d2, int d3, int d4) {
        int score2 = 0;
        if (d1 == rd2 || d1 == rd3 || d1 == rd4) {
            score2 = score2 + 1;
        }
        if (d2 == rd1 || d2 == rd3 || d2 == rd4) {
            score2 = score2 + 1;
        }
        if (d3 == rd1 || d3 == rd2 || d3 == rd4) {
            score2 = score2 + 1;
        }
        if (d4 == rd1 || d4 == rd2 || d4 == rd3) {
            score2 = score2 + 1;
        }
        return score2;
    }

    public static boolean multyPlayer() {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int d1 = rand.nextInt(9) + 1;
        int d2 = rand.nextInt(9) + 1;
        int d3 = rand.nextInt(9) + 1;
        int d4 = rand.nextInt(9) + 1;
        while (d1 == d3 || d2 == d1 || d3 == d2 || d4 == d1 || d4 == d2 || d4 == d3) {
            d1 = rand.nextInt(9) + 1;
            d2 = rand.nextInt(9) + 1;
            d3 = rand.nextInt(9) + 1;
            d4 = rand.nextInt(9) + 1;
        }
        int f1 = rand.nextInt(9) + 1;
        int f2 = rand.nextInt(9) + 1;
        int f3 = rand.nextInt(9) + 1;
        int f4 = rand.nextInt(9) + 1;
        while (f1 == f3 || f2 == f1 || f3 == d2 || f4 == f1 || f4 == f2 || f4 == f3) {
            f1 = rand.nextInt(9) + 1;
            f2 = rand.nextInt(9) + 1;
            f3 = rand.nextInt(9) + 1;
            f4 = rand.nextInt(9) + 1;
        }
        while (true) {
            System.out.println("player 1");
            System.out.println("Enter digit 1 ");
            int rd1 = scan.nextInt();
            System.out.println("Enter digit 2");
            int rd2 = scan.nextInt();
            System.out.println("Enter digit 3");
            int rd3 = scan.nextInt();
            System.out.println("Enter digit 4");
            int rd4 = scan.nextInt();
            System.out.println("player 2");
            System.out.println("Enter digit 1 ");
            int fd1 = scan.nextInt();
            System.out.println("Enter digit 2");
            int fd2 = scan.nextInt();
            System.out.println("Enter digit 3");
            int fd3 = scan.nextInt();
            System.out.println("Enter digit 4");
            int fd4 = scan.nextInt();

            checkIfBulls(rd1, rd2, rd3, rd4, d1, d2, d3, d4);
            checkCows(rd1, rd2, rd3, rd4, d1, d2, d3, d4);
            checkIfBullsPl2(fd1, fd2, fd3, fd4, f1, f2, f3, f4);
            checkCowsPl2(fd1, fd2, fd3, fd4, f1, f2, f3, f4);

            if ((rd1 > 10 || rd1 < 0) || (rd2 > 10 || rd2 < 0) || (rd3 > 10 || rd3 < 0) || (rd4 > 10 || rd4 < 0)) {
                System.out.println("Enter a single digit number");
            }
            if (checkIfDuplicatePl2Input(fd1, rd2, fd3, fd4)) {
                System.out.println("duplicates");
            } else if (checkIfDuplicatePlInput(rd1, rd2, rd3, rd4)) {
                System.out.println("Duplicates");
            } else {
                System.out.println("bulls" + checkIfBulls(rd1, rd2, rd3, rd4, d1, d2, d3, d4));
                System.out.println("cows:" + checkCows(rd1, rd2, rd3, rd4, d1, d2, d3, d4));
            }

            if (checkIfBulls(rd1, rd2, rd3, rd4, d1, d2, d3, d4) == 4) {
                System.out.println("Player 1 wins");
                break;
            }
            if (checkIfBullsPl2(fd1, fd2, fd4, fd4, f1, f2, f3, f4) == 4) {
                System.out.println("Player 2 wins");
                break;
            }

        }
        return true;
    }
}