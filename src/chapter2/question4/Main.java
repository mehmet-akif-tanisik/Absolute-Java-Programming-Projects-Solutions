/*
4. John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
a program to calculate the total number of hours John takes to cover this distance.
The program should print the total time taken in hours and minutes. Use the following
formula for calculations.

                               Time = Distance / Speed
 */

package chapter2.question4;
public class Main {


    public static void main(String[] args) {

        int timeHours = 55/15;
        int timeMinutes = 55%15;

        System.out.printf("Total time: %d Hours %d Minutes",timeHours,timeMinutes);
    }
}
