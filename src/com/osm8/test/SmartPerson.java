package com.osm8.test;

public class SmartPerson implements IScientist{
    String name = "Ivan Ivanov";
    int age = 34;


    @Override
    public int addNumbers(int a, int b) {
        return a+b;
    }

    @Override
    public int divideNumbers(int a, int b) {
        return b != 0 ? a/b : 0;
    }
}
