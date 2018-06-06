package szyfr_cezara;

import java.util.Scanner;

public class Szyfrowanie {
    // A Ą B C Ć D E Ę F G H I J K L Ł M N Ń O Ó P R S Ś T U W Y Z Ź Ż

    public Szyfrowanie() {

    }

    public static void main(String[] args) {
        String input = Szyfrowanie.inputFromUser();
        System.out.println(input);

    }

    public static String inputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text to encrypt: ");
        String results = sc.nextLine();
        sc.close();
        return results;
    }

    public static String szyfruj(String text){
        StringBuilder sb = new StringBuilder(text);

    }
}
