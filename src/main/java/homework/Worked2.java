package homework;

import java.util.Scanner;

public class Worked2 {
    public static void main(String[] args) {

        double papa = .01;
        double dada = .05;
        double lala = .10;
        double fafa = .25;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        double u = papa * scan.nextInt();
        System.out.println("How many nickels would you like?");
        double r = dada * scan.nextInt();
        System.out.println("How many dimes?");
        double a = lala * scan.nextInt();
        System.out.println("How many quarters?");
        double d = fafa * scan.nextInt();
        double total = u + r + a + d;
        if (total == 1.00) {
            System.out.println("You win the game!");
        } else if (total > 1.00) {
            System.out.println("You have more than one dollar. " + " You are over by " + (total - 1.00));
        } else if (total < 1.00) {
            System.out.println("You need " + (1.00 - total) + " more to reach one dollar. ");
        }

    }
}
