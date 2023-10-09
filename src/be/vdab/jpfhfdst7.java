package be.vdab;

import java.util.Scanner;

public class jpfhfdst7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var dag = scanner.next();
        boolean isWeekend = switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" -> false;
            case "zaterdag", "zondag" -> true;
            default -> throw new IllegalArgumentException(dag + " bestaat niet");
        };
        System.out.println(isWeekend ? dag + " is weekend" : dag + " is een werkdag");


        var teller = 1;
        do {
            System.out.println(teller);
            teller++;
        }
        while (teller <= 10);

    }
}
