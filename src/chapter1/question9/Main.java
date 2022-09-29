/*

9. A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
feet of height and 5 pounds for each additional inch. Write a program with a variable
for the height of a person in feet and another variable for the additional inches. Assume
the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
would be represented with a variable that stores the number 6 and another variable that
stores the number 3. Based on these values, calculate and output the ideal body weight.

 */
package chapter1.question9;


public class Main {

    public static double calculateIdealBodyWeight(int heightInFeet, int additionalInches){
        return (((int)(heightInFeet/5)) * 110 ) + (((heightInFeet%5)*12)+additionalInches)*5;
    }

    public static void main(String[] args) {

        // Decleration of height in feet and additional inches
        int heightInFeet = 6;
        int additionalInches = 0;

        // Calculating the ideal body weight = For 5 feet 110 pounds will be added , if there will be extra foot/feet
        // we will multiply with 12 cause 1 feet = 12 inches , then we will add that to the additional inches and
        // we will multiply with 5 to find how many pounds we need to add for extra inches.
        double idealBodyWeight = (110) + (((heightInFeet%5)*12)+additionalInches)*5;

        // Printing the output to the screen.
        System.out.println("Height in feet: "+heightInFeet+"\nAdditional Inches: " + additionalInches + "\nIdeal Body Weight: " + idealBodyWeight + " pounds.");


        // Same program written in method above returns the idealBodyWeight in pounds.
        System.out.println(calculateIdealBodyWeight(5,5));
    }
}
