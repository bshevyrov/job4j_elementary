package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double yearAmount = (amount * (percent / 100)  + amount);
           while (yearAmount > salary) {
            yearAmount = ((amount * (percent / 100)  + amount) - salary);
            year++;
        }
        return year;
    }
}
