package ru.job4j.condition;

public class Cinema {
    private static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        System.out.println(age >= 21 ? "Welcome to the cinema."
                : "It is not for you.");
            }

    public static void permission(boolean allowByParent, boolean hasMoney) {
        System.out.println(allowByParent && hasMoney
                ? "I can go to the cinema." : "I can`t.");
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
