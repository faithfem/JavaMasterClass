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
    }
}
