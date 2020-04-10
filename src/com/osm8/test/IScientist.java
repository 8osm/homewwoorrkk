package com.osm8.test;

public interface IScientist {
    int addNumbers(int a, int b);
    int divideNumbers(int a, int b);
    default void saySomethingSmart(){
        System.out.println("Mytochondria is the powerhouse of the cell");
    };
}
