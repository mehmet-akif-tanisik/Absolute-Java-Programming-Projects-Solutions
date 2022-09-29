package chapter2.question5;/*
5. Grade point average (GPA) in a 4-point scale is calculated by using the following formula:

                                 GPA= (Percentage / 100) x 4

Write a program that takes as input the percentage from a user. The program
should then output the user’s GPA on the screen. The format of the output should
be as follows, assuming the user’s percentage is 85:

                                  (85/100) * 4 = 3
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Taking input from user with Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter percentage: ");
        int percentage = scanner.nextInt();
        int gpa = percentage/25 ;

        System.out.printf("(%d/100) * 4 = %d", percentage, gpa );


        System.out.println("This is a git try!!!!!!");
    }
}
