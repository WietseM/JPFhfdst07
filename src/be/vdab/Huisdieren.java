package be.vdab;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel huisdieren?");
        var aantalHuisdieren = scanner.nextInt();
        switch(aantalHuisdieren) {
            case 1 -> System.out.println("Maar eentje?");
            case 2 -> System.out.println("Toch niet zo verzot op dieren als gedacht?");
            case 3 -> System.out.println("Het perfecte aantal!");
            default -> System.out.println("Je kon er niet genoeg hebben?");
        }
    }
}
