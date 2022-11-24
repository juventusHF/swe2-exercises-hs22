package ch.juventus.recursion;

import java.util.List;

public class RecursionExercises {

    private static int recursionCounter = 0;
    private static final List<String> testInputs = List.of(
            "Anna",
            "Korb",
            "Bob",
            "Mein Computer",
            "Level",
            "Fluss",
            "Anna Bob Anna",
            "Kamel und Stein",
            "!+Level+!"
    );

    public static void main(String[] args) {
        int n = 40;
        executeIterative(n);
        executeRecursive(n);
        System.out.println("Recursion counter: " + recursionCounter);

        for (String input : testInputs) {
            boolean isPalindrome = isPalindrome(input);
            System.out.println(input + " -> " + isPalindrome);
        }
    }

    private static void executeIterative(int n) {
        long start = System.currentTimeMillis();
        int result = fibIterative(n);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + ", took: " + (end - start) + "ms");
    }
    private static void executeRecursive(int n) {
        long start = System.currentTimeMillis();
        int result = fibRecursive(n);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + ", took: " + (end - start) + "ms");
    }

    private static int fibIterative(int n) {
        int fib = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

    private static int fibRecursive(int n) {
        recursionCounter++;
        if (n <= 1) {
            return n;
        } else {
            return fibRecursive(n-2) + fibRecursive(n-1);
        }
    }

    private static boolean isPalindrome(String input) {
        if (input.length() <=1) {
            return true;
        }

        String firstCharacter = input.substring(0, 1);
        String lastCharacter = input.substring(input.length()-1);

        if (firstCharacter.equalsIgnoreCase(lastCharacter)) {
            return isPalindrome(input.substring(1, input.length()-1));
        }

        return false;
    }

}
