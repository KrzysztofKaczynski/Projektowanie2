package szyfr_cezara;

import java.util.Scanner;

public class Szyfrowanie {
    // A Ą B C Ć D E Ę F G H I J K L Ł M N Ń O Ó P R S Ś T U W Y Z Ź Ż

    public Szyfrowanie() {

    }

    public static void main(String[] args) {
        String input = Szyfrowanie.inputFromUser();
        System.out.println(input);
        String szyfrowanie = Szyfrowanie.szyfruj(input);
        System.out.println(szyfrowanie);
        String deszyfrowanie = Szyfrowanie.deszyfruj(szyfrowanie);
        System.out.println(deszyfrowanie);
    }

    public static String inputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text to encrypt: ");
        String results = sc.nextLine();
        sc.close();
        return results;
    }

    public static String szyfruj(String text) {
        StringBuilder sb = new StringBuilder(text);
        int distance = 5;
        for (int i = 0; i < sb.length(); i++) {
            int c = (int) sb.charAt(i);
            if (c + distance > 122) {
                c = 31 + (distance - (122 - c));

            } else {
                c += distance;
            }
            sb.setCharAt(i, (char) c);

        }
        return sb.toString();
    }

    public static String deszyfruj(String text) {
        StringBuilder sb = new StringBuilder(text);
        int distance = 5;
        for (int i = 0; i < sb.length(); i++) {
            int c = (int) sb.charAt(i);
            if (c - distance < 32) {
                c = 123 - (distance - (c - 32));

            } else {
                c -= distance;
            }
            sb.setCharAt(i, (char) c);

        }
        return sb.toString();
    }
}