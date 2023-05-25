package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "John";
        int age = 20;
        double height = 1.8;
        double weight = 70.3;
        double bmi = height / weight;
        double soma = age + height;

        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + "m tall.");
        System.out.println("The sum of your age and height is " + soma + ".");
        System.out.println("Your BMI is " + bmi + ".");

        if (age < 18) {
            System.out.println("You are not an adult.");
        } else {
            System.out.println("You are an adult.");
        }
    }
}
