package com.florkey;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32 (2^31)
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myNewByteValue = (byte) (minByteValue/2);

        // byte has a width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;

        // long has a width of 64 (2^63)
        long myLongValue = 100L;

        // challenge
        byte challengeByte = 5;
        short challengeShort = 20;
        int challengeInt = 1000;

        long challenge = 50000 + 10 * (challengeByte + challengeShort + challengeInt);
        System.out.println(challenge);
    }
}
