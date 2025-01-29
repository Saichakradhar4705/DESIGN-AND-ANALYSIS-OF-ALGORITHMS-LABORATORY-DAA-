package org.example;
import java.util.Random;
public class DAALAB5 {
        static String specialChars = "!@#$%^&*()-_+=<>?/";
        static Random rand = new Random();

        static StringBuilder add_more_char(StringBuilder str, int need, String charSet) {
            for (int i = 0; i < need; i++) {
                char randomChar = charSet.charAt(rand.nextInt(charSet.length()));
                int pos = rand.nextInt(str.length());
                str.insert(pos, randomChar);
            }
            return str;
        }

        static StringBuilder suggester(int l, int u, int d, int s, StringBuilder str) {
            if (l == 0) str = add_more_char(str, 1, "abcdefghijklmnopqrstuvwxyz");
            if (u == 0) str = add_more_char(str, 1, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            if (d == 0) str = add_more_char(str, 1, "0123456789");
            if (s == 0) str = add_more_char(str, 1, specialChars);
            while (str.length() < 8) {
                str.append(specialChars.charAt(rand.nextInt(specialChars.length())));
            }
            return str;
        }

        static void generate_password(int n, StringBuilder p) {
            int lower = 0, upper = 0, digit = 0, special = 0;
            for (char ch : p.toString().toCharArray()) {
                if (Character.isLowerCase(ch)) lower = 1;
                else if (Character.isUpperCase(ch)) upper = 1;
                else if (Character.isDigit(ch)) digit = 1;
                else if (specialChars.contains(Character.toString(ch))) special = 1;
            }

            if (n >= 8 && lower == 1 && upper == 1 && digit == 1 && special == 1) {
                System.out.println("Your Password is Strong");
            } else {
                System.out.println("Suggested Passwords:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(suggester(lower, upper, digit, special, new StringBuilder(p)));
                }
            }
        }

        public static void main(String[] args) {
            StringBuilder input_String = new StringBuilder("iare@2024");
            generate_password(input_String.length(), input_String);
        }
}
