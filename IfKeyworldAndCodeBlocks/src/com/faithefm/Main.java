package com.faithefm;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 5000;
	int levelCompleted = 5;
	int bonus = 100;

	if(score ==5000) {
        System.out.println("Your score was " + score +
                " and you earned a bonus of " + bonus +
                " after reaching level " + levelCompleted);
    }else{
		System.out.println(gameOver);
	}
    }
}
