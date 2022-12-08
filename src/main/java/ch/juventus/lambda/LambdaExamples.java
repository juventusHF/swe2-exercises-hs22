package ch.juventus.lambda;

import java.util.Date;
import java.util.function.Function;

public class LambdaExamples {

    public static void main(String[] args) {
        // Übung 1
        Function<Date, String> dateConverter = (date) -> "Jetzt ist " + date;
        System.out.println(dateConverter.apply(new Date()));

        // Übung 2
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(operate(10, 5, addition));
        System.out.println(operate(10, 5, subtraction));
        System.out.println(operate(10, 5, multiplication));
        System.out.println(operate(10, 5, division));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

}
