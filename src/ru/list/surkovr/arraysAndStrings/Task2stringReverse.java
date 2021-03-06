package ru.list.surkovr.arraysAndStrings;

// Task 2
// Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
// five characters, including the null character.)

public class Task2stringReverse {

    public static void main(String[] args) {

        String s = "String to reverse";
        String res = reverseCstyleString(s);

        System.out.println(res);
    }

    private static String reverseCstyleString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char nullChar = '\u0000';
        stringBuilder.append(nullChar);
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
