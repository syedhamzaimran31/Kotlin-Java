package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 10;

        System.out.print(a + " " + b);
        for (int i = 0; i < count - 2; i++) {
            c = a + b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }

    }
}