package com.osm8.test;

public class Main {

    public static void main(String[] args) {
        IScientist scientist = new SmartPerson();
        System.out.println(scientist.addNumbers(12,34));
        System.out.println(scientist.divideNumbers(123,1413));
        scientist.saySomethingSmart();
    }
}
