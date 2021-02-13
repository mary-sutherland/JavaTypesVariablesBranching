package com.tts;


//Casting is a way to force the compiler to bend to your wishes as a programmer
//by putting the desired type in parentheses in front of the variable.
public class Casting {

    byte b = (byte) 2321;

    //However this may not keep you from getting unexpected results. Casting should
    //be kept to a minimum.

    //Storage specifications are also important particularly when "upcasting"
    //and "downcasting"

    int smallInt = 120; //int is 4 bytes
    int biggerInt = 550; //int is 4 bytes

    //downcasting 4 bytes into 1 byte
    byte b1 = (byte)smallInt; //value in both will be 120;
    byte b2 = (byte)biggerInt; //value out of range, will be truncated

    //downcasting 4bytes into 2 bytes
    short s1 = (short)biggerInt; //value in range, no truncation

    //all the casting examples use integer type values for demonstration

    //when casting from decimal type to an integer type, even of the same size, the
    //decimal part of the value will be lost

    //float data type has up to 6-7 total digits of precision
    //when casting from a float to a int it truncates

    //OPERATORS
    // We can increment or decrement an integer by using ++ and --




}
