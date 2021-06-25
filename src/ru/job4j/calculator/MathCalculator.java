
package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double divisionAndSubtraction(double first, double second) {
        return division(first, second)
                + subtraction(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndMultiplyAndDivisionAndSubtraction(double first, double second) {
        return sumAndMultiply(first, second) + divisionAndSubtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы разности и деления равен: "
                + divisionAndSubtraction(10, 20));
        System.out.println("Результат суммы всех действий равен: "
                + sumAndMultiplyAndDivisionAndSubtraction(10, 20));

    }

}