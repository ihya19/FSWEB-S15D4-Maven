package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }


        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
