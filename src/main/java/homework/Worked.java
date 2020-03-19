package homework;
import java.util.Scanner;


public class Worked {
    public static void main(String[] args) {

        Scanner yeyo = new Scanner(System.in);

        int bank = 80000;

        System.out.println("What is your currently salary?");
        int myMoney = yeyo.nextInt();

        System.out.println("How many years have you worked?");
        int myYears = yeyo.nextInt();

        if(myMoney >= bank) {
            System.out.println("Yay! You qualify!");
        } else
            System.out.println("You need " + (bank - myMoney) + " more to qualify.");

        }



    }

