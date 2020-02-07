package com.mkolongo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide the size of logo(odd number): ");
        int n = scanner.nextInt();

        LogoMaker logoMaker = new MMLogo(n);
        System.out.println(logoMaker.print());
    }
}
