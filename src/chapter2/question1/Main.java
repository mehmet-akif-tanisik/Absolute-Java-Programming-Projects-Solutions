
/*
1. The Babylonian algorithm to compute the square root of a positive number n is as
follows:
1. Make a guess at the answer (you can pick n/2 as your initial guess).
2. Compute r = n / guess
3. Set guess = (guess +r)/ 2
4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
2 and 3, the closer guess will become to the square root of n.
Write a program that inputs a double for n, iterates through the Babylonian algorithm
five times, and outputs the answer as a double to two decimal places. Your
answer will be most accurate for small values of n.
 */

package chapter2.question1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("""
                **********************************
                ***Babylonian Algorithm Example***
                **********************************
                """);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number to guess it's square root: ");
        double babyNumber = scanner.nextDouble(); // Positive number n

        //1st iteration
        double guess = (double) (babyNumber / 2); // Step 1
        double r= babyNumber / guess; // Step 2
        guess = (guess + r) / 2; // Step 3
        System.out.printf("1st iteration guess - %.2f %n", guess);

        //2nd iteration
        r= babyNumber / guess;
        guess = (guess + r) / 2;
        System.out.printf("2nd iteration guess - %.2f %n", guess);

        //3rd iteration
        r= babyNumber / guess;
        guess = (guess + r) / 2;
        System.out.printf("3rd iteration guess - %.2f %n", guess);

        //4th iteration
        r= babyNumber / guess;
        guess = (guess + r) / 2;
        System.out.printf("4th iteration guess - %.2f %n", guess);

        //5th iteration
        r= babyNumber / guess;
        guess = (guess + r) / 2;
        System.out.printf("5th iteration guess - %.2f %n", guess);


    }
}
