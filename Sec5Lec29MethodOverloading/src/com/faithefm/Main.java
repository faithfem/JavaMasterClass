package com.faithefm;

public class Main {

    public static void main(String[] args) {
	// method overloading: same method name but diff parameters
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + "points");
        return score * 1000;
    }
}
