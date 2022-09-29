
package chapter1.question6;
/*

6. Write a program for calculating the simple interest on a loan when the initial principal
amount (princi_amnt) is $1000, the initial interest rate (int_rate) is 5.0%,
and the number of years (no_of_yrs) is 5. Use suitable data types to declare these
variables. Simple interest is calculated using the following equation:
Simple interest = (Principal amount * Interest rate * Number of years) / 100


 */


public class Main {


    public static void main(String[] args) {

        double princi_amnt = 1000;
        double int_rate= 5;
        int num_of_yrs= 5;

        double simple_interest = (princi_amnt * int_rate * num_of_yrs) / 100 ;
        System.out.println("Simple interest of " +princi_amnt+"$" + " for " +num_of_yrs +" years with " +int_rate+ "% interest rate is: "+ simple_interest+"$");

    }
}
