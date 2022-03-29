package com.company;

public class Main {

    public static void main(String[] args) {

        int x = Math.mult(12,23);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        Math.x = 24;
        Math b = new Math();
        System.out.println(b.x);
    }
}
