package com.codegym;

public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(Fan1.isON());
        System.out.println(Fan1);
        Fan Fan2 = new Fan(2, false, 5, "blue");
        System.out.println(Fan2.isON());
        System.out.println(Fan2);
    }
}