package com.company;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Try1 {


    public static boolean checkIfDuplicatePlInput(int rd1,int rd2,int rd3,int rd4){
        return rd1 == rd3 || rd2 == rd1 || rd3 == rd2 || rd4 == rd1 || rd4 == rd2 || rd4 == rd3;
    }
    public static int checkIfDuplicatebuls(int score, int rd1, int rd2, int rd3, int rd4, int d1, int d2, int d3, int d4){

        if (rd1==d1) {
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
    public static boolean singlePlayer() {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(9999) + 1000;
        int[] a= new int[n];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((a[i] == a[j]) && (i != j))
                {
                    n = rand.nextInt(9999) + 1000;
                }
            }
        }


        System.out.println("Enter a four diget number");

        while (true) {
            int e = scan.nextInt();
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
            int d3 = (n / 100) % 10;
            int d4 = (n / 1000) % 10;

            int rd1 = e % 10;
            int rd2 = (e /10)%10;
            int rd3 = (e /100)%10;
            int rd4 = (e /1000)%10;

            int score=0;
            int score2=0;
            if (rd1==d1) {
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
            //   checkIfDuplicatebuls(score,rd1,rd2,rd3,rd4,d1,d2,d3,d4);
            if (d1==rd2||d1==rd3||d1==rd4){
                score2=score2+1;
            }
            if (d2==rd1||d2==rd3||d2==rd4){
                score2=score2+1;
            }
            if (d3==rd1||d3==rd2||d3==rd4){
                score2=score2+1;
            }
            if (d4==rd1||d4==rd2||d4==rd3){
                score2=score2+1;
            }

            if ((e > 9999 || e < 1000)){
                System.out.println("Enter a four digit number");
            }

            else if(checkIfDuplicatePlInput(rd1,rd2,rd3,rd4)) {
                System.out.println("Duplicates");
            }
            else {
                System.out.println("bulls"+score);
                System.out.println("cows:"+score2);
            }

            if (score==4){
                System.out.println("You win");
                scan.close();
            }

        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choice a gamemode:");
        System.out.println("Type S for Sinlgeplayer");
        System.out.println("Type M for Multiplayer");
        String singleORMultyplayer= scan.next();

        switch (singleORMultyplayer.toLowerCase(Locale.ROOT)) {
            case "s" -> System.out.println(singlePlayer());
            case "m" -> System.out.println("Madrid");
            default -> System.out.println("Please select S or M");
        }
    }
}