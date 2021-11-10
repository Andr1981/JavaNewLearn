package ru.geekbrains.lesson2;

public class Main {
    public static int a = 5;
    public static int b = 2;
    public static int c;

    public static void main(String[] args) {
        System.out.println("Hello World");

        c = a + b;

        if (c < 10) {
            System.out.println("Привет");
            System.out.println("You are good");
        }
    }
}