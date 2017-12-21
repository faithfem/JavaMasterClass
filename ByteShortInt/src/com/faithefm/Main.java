package com.faithefm;

public class Main {

    public static void main(String[] args) {

    //DATA TYPES THAT DEAL WITH WHOLE NUMBERS
    // int has a width of 21
    int myMinValue = 2_147_483; //use underscore to make number more readable since no commas
	//int myMaxValue = 2147483649;

    //byte has a width of 8
    byte myByteValue = -128; //max min is 128
    byte myNewByteValue = (byte) (myByteValue/2);

    //short has a width of 16
    short myShort = 32767;

    //long has a width of 64
    long myLong = 9_223_372_036_854_775_807L;


        System.out.println(myMinValue);
        System.out.println(myByteValue);

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        //1. create a double variable with the value 20
        //2. create a second variable of type double with the value 80
        //3. add both numbers up and multiply by 25
        //4. use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //5. write an "if" statement that displays a message "Total was over the limit"
        //   if the remaining total in #4 is equal to 20 or less.

        double myFirstNumber = 20;
        double mySecondNumber = 80;
        double myResult = (myFirstNumber + mySecondNumber) * 25;
        double myRemainder = myResult%40;
        System.out.println("My Result is " + myResult);
        System.out.println("The Remainder is " + myRemainder);
        if(myRemainder <= 20){
            System.out.println("Total was over the limit!");
        } else{
            System.out.println("Total was NOT over the limit!");
        }




















    }
}
