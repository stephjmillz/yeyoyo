package homework;
import java.util.Scanner;

public class Worked5 {
    public static void main(String[] args) {

        //step one scan for user input
        Scanner phuckdis = new Scanner(System.in);
        boolean runItUp = true;
        final String rightPass = "Jmillz";
        int doof = 3;


        while (doof-- > 0) {
            System.out.println("Please enter the correct password");
            String myPassNiqqa = phuckdis.nextLine();

            if (myPassNiqqa.equals(rightPass)) {
                System.out.println("Password is correct! " + " You are now logged in! ");
                return;

            } else {
                System.out.println("Password is incorrect. You have: " + doof + " more attempts remaining.");

                if (doof == 0) {
                    System.out.println("You are now locked out of your account!");


                }
            }
        }
    }
}
