//package test;

//import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String phrase = "Hello, World!";
        int shift = 3;

        System.out.println("Original phrase: " + phrase);
        System.out.println("Shift: " + shift);
        System.out.println("Encrypted phrase: " + Exercise.Calculate(phrase, shift));
    }
}