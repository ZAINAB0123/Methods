package tasks;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//  написать метод
// public static boolean isEvenCharsAmount(String str)
//в него передается строка, вам нужно вернуть true, если в строке четное количество символов, и false, если нечетное

import java.util.regex.Pattern;

public class Boolean {
    public static void main(String[] args) {
        String stringExample = "строка";
        System.out.println("Четное количество символов:");
        System.out.println(isEwenCharsAmount(stringExample));

        String stringExample2 = "строка";
        System.out.println("Одинаковое количество символов:");
        System.out.println(isSame(stringExample2));

        String stringExample3 = "строка";
        System.out.println("Содержит только английские буквы");
        System.out.println(isEngWord(stringExample3));

    }
    // написать метод public static boolean isSame(String str)
    // в него передается строка. вам нужно вернуть true, если в строке все символы одинаковые, и false в противном случае
    public static boolean isEwenCharsAmount(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean isSame(String str) {
        return str != null && !str.isEmpty() && str.chars().allMatch(c -> str.charAt(0) == c);
    }
    // написать метод public static boolean isEngWord(String str)
    // в него передается строка. вам нужно вернуть true, если строка содержит только английские буквы,
//    и нужно вернуть false,  если в строке буквы из других языков, символы, цифры

    public static boolean isEngWord(String str) {
        String inputString = "Hello";
        return Pattern.matches("[a-zA-Z]+", inputString);
    }
}


