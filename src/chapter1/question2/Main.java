package chapter1.question2;/*
2. The video game machines at your local arcade output coupons according to how well you play the game.
You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs.
Write a program that defines a variable initially assigned to the number of coupons you win. Next, the
program should output how many candy bars and gumballs you can get if you spend all of your coupons on
candy bars first, and any remaining coupons on gumballs.
 */


import java.util.Scanner;

public class Main {

    public static final int candyBarsLimit=10;
    public static final int gumballLimit=3;


    // Method to redeem candy bars and gumballs for coupons
    public static String redeemCandyAndGumball(int couponNumber){

        int gotCandy= couponNumber/candyBarsLimit;
        int gotGumball= ( couponNumber%candyBarsLimit ) /gumballLimit;
        int remainCoupons = couponNumber - ((gotCandy*candyBarsLimit)+(gotGumball*gumballLimit));

        return "You can get " + gotCandy + " candy bars and " + gotGumball + " gumballs.\n" +
                "Number of coupons remain: " + remainCoupons ;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many coupons do you have ? ");
        System.out.print("Please enter your coupons number: ");
        int couponNumber= scanner.nextInt();
        System.out.println(redeemCandyAndGumball(couponNumber));





    }
}
