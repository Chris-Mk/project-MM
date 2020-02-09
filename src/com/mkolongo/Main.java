package com.mkolongo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the size of logo(odd number).");
        System.out.print("Size(2 - 10000): ");
        int n = scanner.nextInt();

        while (n <= 2 || n >= 10000 || n % 2 == 0) {
            System.out.println("Invalid size!");
            System.out.print("Size(2 - 10000): ");
            n = scanner.nextInt();
        }

        LogoMaker logoMaker = new MMLogo(n);
        System.out.println(logoMaker.print());
    }
}
