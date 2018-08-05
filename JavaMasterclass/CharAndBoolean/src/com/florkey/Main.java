package com.florkey;

public class Main {

    public static void main(String[] args) {
        // char can store one character, including unicode
        // width of 16 (2 bytes)
	    char myChar = '\u00A9';
        System.out.println(myChar);

        // boolean can be true or false
        boolean myBoolean = true;

        char registered = '\u00AE';
        System.out.println("Registered symbol: " + registered);
    }
}
