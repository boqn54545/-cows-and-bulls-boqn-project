package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static boolean checkIfDuplicatePlInput(int digit1P1Input, int digit2P1Input, int digit3P1Input, int digit4P1Input) {
        return digit1P1Input == digit3P1Input || digit2P1Input == digit1P1Input || digit3P1Input == digit2P1Input || digit4P1Input == digit1P1Input || digit4P1Input == digit2P1Input || digit4P1Input == digit3P1Input;
    }

    public static int countBullsPl(int score, int digit1P1Input, int digit2P1Input, int digit3P1Input, int digit4P1Input, int randDigit1P1, int randDigit2P1, int randDigit3P1, int randDigit4P1) {
        score = 0;
        if (digit1P1Input == randDigit1P1) {
            score = score + 1;
        }
        if (digit2P1Input == randDigit2P1) {

            score = score + 1;
        }
        if (digit3P1Input == randDigit3P1) {
            score = score + 1;
        }
        if (digit4P1Input == randDigit4P1) {
            score = score + 1;
        }
        return score;
    }

    public static int countCowsPl(int digit1P1Input, int digit2P1Input, int digit3P1Input, int digit4P1Input, int randDigit1P1, int randDigit2P1, int randDigit3P1, int randDigit4P1) {
        int score2 = 0;
        if (randDigit1P1 == digit2P1Input || randDigit1P1 == digit3P1Input || randDigit1P1 == digit4P1Input) {
            score2 = score2 + 1;
        }
        if (randDigit2P1 == digit1P1Input || randDigit2P1 == digit3P1Input || randDigit2P1 == digit4P1Input) {
            score2 = score2 + 1;
        }
        if (randDigit3P1 == digit1P1Input || randDigit3P1 == digit2P1Input || randDigit3P1 == digit4P1Input) {
            score2 = score2 + 1;
        }
        if (randDigit4P1 == digit1P1Input || randDigit4P1 == digit2P1Input || randDigit4P1 == digit3P1Input) {
            score2 = score2 + 1;
        }
        return score2;
    }

    public static boolean checkIfOneDigitAtATimePl(int digit1P1Input, int digit2P1Input, int digit3P1Input, int digit4P1Input) {
        boolean b = (digit1P1Input > 10 || digit1P1Input < 0) || (digit2P1Input > 10 || digit2P1Input < 0) || (digit3P1Input > 10 || digit3P1Input < 0) || (digit4P1Input > 10 || digit4P1Input < 0);
        if (b) {
            System.out.println("Player 1 please enter a single digit at a time");
        }
        return b;
    }

    public static boolean checkIfRandDuplicatePl(int digit1P1Input, int digit2P1Input, int digit3P1Input, int digit4P1Input) {
        return digit1P1Input == digit3P1Input || digit2P1Input == digit1P1Input || digit3P1Input == digit2P1Input || digit4P1Input == digit1P1Input || digit4P1Input == digit2P1Input || digit4P1Input == digit3P1Input;
    }

    public static boolean multyPlayer() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int scorePl1 = 0;
        int scorePl2 = 0;
        int randDigit1P1 = rand.nextInt(9) + 1;
        int randDigit2P1 = rand.nextInt(9) + 1;
        int randDigit3P1 = rand.nextInt(9) + 1;
        int randDigit4P1 = rand.nextInt(9) + 1;
        while (randDigit1P1 == randDigit3P1 || randDigit2P1 == randDigit1P1 || randDigit3P1 == randDigit2P1 || randDigit4P1 == randDigit1P1 || randDigit4P1 == randDigit2P1 || randDigit4P1 == randDigit3P1) {
            randDigit1P1 = rand.nextInt(9) + 1;
            randDigit2P1 = rand.nextInt(9) + 1;
            randDigit3P1 = rand.nextInt(9) + 1;
            randDigit4P1 = rand.nextInt(9) + 1;
        }
        int randDigit1P2 = rand.nextInt(9) + 1;
        int randDigit2P2 = rand.nextInt(9) + 1;
        int randDigit3P2 = rand.nextInt(9) + 1;
        int randDigit4P2 = rand.nextInt(9) + 1;
        while (checkIfRandDuplicatePl(randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2)) {
            randDigit1P2 = rand.nextInt(9) + 1;
            randDigit2P2 = rand.nextInt(9) + 1;
            randDigit3P2 = rand.nextInt(9) + 1;
            randDigit4P2 = rand.nextInt(9) + 1;
        }
        while (true) {
            System.out.println("player 1");
            System.out.println("Enter digit 1 ");
            int digit1P1Input = scan.nextInt();
            System.out.println("Enter digit 2");
            int digit2P1Input = scan.nextInt();
            System.out.println("Enter digit 3");
            int digit3P1Input = scan.nextInt();
            System.out.println("Enter digit 4");
            int digit4P1Input = scan.nextInt();

            countBullsPl(scorePl1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1);
            countCowsPl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1);

            if (checkIfOneDigitAtATimePl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input)) {
            } else if (checkIfDuplicatePlInput(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input)) {
                System.out.println("Player 1 duplicates");
            } else {
                System.out.println("bulls:" + countBullsPl(scorePl1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1));
                System.out.println("cows:" + countCowsPl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1));
            }
            if (countBullsPl(scorePl1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1) == 4) {
                System.out.println("Player 1 wins");
                break;
            }
            System.out.println("player 2");
            System.out.println("Enter digit 1 ");
            int digit1P2Input = scan.nextInt();
            System.out.println("Enter digit 2");
            int digit2P2Input = scan.nextInt();
            System.out.println("Enter digit 3");
            int digit3P2Input = scan.nextInt();
            System.out.println("Enter digit 4");
            int digit4P2Input = scan.nextInt();
            countBullsPl(scorePl2, digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input, randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2);
            countCowsPl(digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input, randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2);

            if (checkIfOneDigitAtATimePl(digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input)) ;
            else if (checkIfDuplicatePlInput(digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input)) {
                System.out.println("Player 2 duplicates");
            } else {
                System.out.println("bulls:" + countBullsPl(scorePl2, digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input, randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2));
                System.out.println("cows:" + countCowsPl(digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input, randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2));
            }
            if (countBullsPl(scorePl2, digit1P2Input, digit2P2Input, digit3P2Input, digit4P2Input, randDigit1P2, randDigit2P2, randDigit3P2, randDigit4P2) == 4) {
                System.out.println("Player 2 wins");
                break;
            }
        }
        return true;
    }

    public static boolean singlePlayer() {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int scoreP1 = 0;
        int randDigit1P1 = rand.nextInt(9) + 1;
        int randDigit2P1 = rand.nextInt(9) + 1;
        int randDigit3P1 = rand.nextInt(9) + 1;
        int randDigit4P1 = rand.nextInt(9) + 1;
        while (checkIfRandDuplicatePl(randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1)) {
            randDigit1P1 = rand.nextInt(9) + 1;
            randDigit2P1 = rand.nextInt(9) + 1;
            randDigit3P1 = rand.nextInt(9) + 1;
            randDigit4P1 = rand.nextInt(9) + 1;
        }

        while (true) {
            System.out.println("Player 1");
            System.out.println("Enter digit 1 ");
            int digit1P1Input = scan.nextInt();
            System.out.println("Enter digit 2");
            int digit2P1Input = scan.nextInt();
            System.out.println("Enter digit 3");
            int digit3P1Input = scan.nextInt();
            System.out.println("Enter digit 4");
            int digit4P1Input = scan.nextInt();

            countBullsPl(scoreP1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1);
            countCowsPl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1);
            if (checkIfOneDigitAtATimePl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input)) ;
            else if (checkIfDuplicatePlInput(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input)) {
                System.out.println("Duplicates");
            } else {
                System.out.println("bulls:" + countBullsPl(scoreP1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1));
                System.out.println("cows:" + countCowsPl(digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1));
            }
            if (countBullsPl(scoreP1, digit1P1Input, digit2P1Input, digit3P1Input, digit4P1Input, randDigit1P1, randDigit2P1, randDigit3P1, randDigit4P1) == 4) {
                System.out.println("You win!!!");
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a gamemode:");
            System.out.println("Type S for Sinlgeplayer");
            System.out.println("Type M for Multiplayer");
            System.out.println("Type E to exit");
            String singleORMultyplayer = scan.next();

            switch (singleORMultyplayer.toLowerCase(Locale.ROOT)) {
                case "s" -> System.out.println(singlePlayer());
                case "m" -> System.out.println(multyPlayer());
                case "e" -> scan.close();

                default -> System.out.println("Something went wrong!");
            }
        }
    }
}






