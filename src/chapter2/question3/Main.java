/*
3. Write a program that reads in two numbers typed on the keyboard and divides
the first number by the second number. The program should output the dividend,
divisor, quotient, and remainder on the screen.
 */

package chapter2.question3;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor ;
        int remainder = dividend%divisor;

        System.out.println("Dividend       "+ dividend );
        System.out.println("--------  =  ------");
        System.out.println("Divisor        "+ divisor);
        System.out.println("------------------------------");
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}
