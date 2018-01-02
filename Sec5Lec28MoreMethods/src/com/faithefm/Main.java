package com.faithefm;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //note that u can also use variable names instead of values
        calculateScore(true, 800,5,100);
        calculateScore(true, 10000, 8, 200);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + levelCompleted*bonus;
            System.out.println("Your final score was " + finalScore + "you win the game!");
        }
        //return -1;// needed only if you replace "void" in line 15 with e.g., int

    }
}
