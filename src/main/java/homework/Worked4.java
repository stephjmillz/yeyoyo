package homework;

import java.util.Scanner;
public class Worked4 {

    public static void main(String[] args) {

        Scanner phacks = new Scanner(System.in);

        System.out.println("Enter your salary.");
        int lolzInput = phacks.nextInt();


        System.out.println("Enter total hours worked.");

        int myTime = phacks.nextInt();

        if (myTime > 40) {
            System.out.println((1.5 * lolzInput) * myTime);
        } else if (myTime < 40)
            System.out.println(lolzInput*myTime);


    }
}
