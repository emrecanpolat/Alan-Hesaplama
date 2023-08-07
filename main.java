package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, cevreYarisi, alan;

        Scanner input = new Scanner(System.in);  // Create a Scanner object 1 kere tanımlamak yeterli
        System.out.print("1. kenarın uzunluğunu giriniz:");
        kenar1 = input.nextInt();  // Read user input

        System.out.print("2. kenarın uzunluğunu giriniz:");
        kenar2 = input.nextInt();  // Read user input

        System.out.print("3. kenarın uzunluğunu giriniz:");
        kenar3 = input.nextInt();  // Read user input

        cevreYarisi = (kenar1 + kenar2 + kenar3)/2;
        alan = Math.sqrt(cevreYarisi*(cevreYarisi-kenar1)*(cevreYarisi-kenar2)*(cevreYarisi-kenar3));

        System.out.println(alan);





    }
}
