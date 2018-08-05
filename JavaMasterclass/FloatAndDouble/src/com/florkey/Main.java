package com.florkey;

public class Main {

    public static void main(String[] args) {
        // width of 32 (4 bytes)
	    int intVal = 5/ 3;

	    // width of 32 (4 bytes)
	    // float has seven decimal points of precision
	    float floatVal = 5f / 3f;

	    // width of 64 (8 bytes)
	    // double has 16 decimal points of precision
	    double doubleVal = 5d / 3d;
        System.out.println("int value: " + intVal);
        System.out.println("float value: " + floatVal);
        System.out.println("double value: " + doubleVal);

        // challenge
        double myWeight = 162;
        double myWeightInKilos = myWeight * 0.45359237;
        System.out.println("My weight in kilograms is " + myWeightInKilos);

    }
}
