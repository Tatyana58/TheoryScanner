package Scaner;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // Создаем объект класса Scanner, которому в параметр передаем
        // условие получения входных данных - «через консоль»
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        // Для присвоения значения целочесленной переменной используется метод nextInt()
        int age = scanner.nextInt(); // вводим в консоль 19

        System.out.println("Enter your name");
        // Для присвоения значения строковой переменной используется метод next()
        String name = scanner.next(); // вводим в консоль Java-master

        if (age < 18) {
            System.out.println(name + " this page is adults only");
        } else {
            System.out.println("Welcome to the application " + name);
        }

    }
}
