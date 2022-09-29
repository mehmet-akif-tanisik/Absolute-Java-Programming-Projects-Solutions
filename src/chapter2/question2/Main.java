/*
(This is a version with input of an exercise from Chapter 1.) Write a program that
inputs two string variables, first and last, which the user should enter with his or
her name. First, convert both strings to all lowercase. Your program should then create
a new string that contains the full name in pig latin with the first letter capitalized
for the first and last name. Use only the pig latin rule of moving the first letter to the
end of the word and adding “ay.” Output the pig latin name to the screen. Use the
substring and toUpperCase methods to construct the new name.
For example, if the user inputs “Walt” for the first name and “Savitch” for the
last name, then the program should create a new string with the text “Altway
Avitchsay” and print it.
 */

package chapter2.question2;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first and last name: ");
        // Inputs for first and last name converted to all lower cases
        String firstName = scanner.next().toLowerCase(Locale.ROOT);
        String lastName = scanner.next().toLowerCase(Locale.ROOT);

        // Making First Letter to UpperCase + Adding Rest + Adding Original First letter + Adding "ay"
        String pigFirst = firstName.substring(1,2).toUpperCase(Locale.ROOT) +firstName.substring(2) + firstName.substring(0,1) + "ay";
        String pigLast = lastName.substring(1,2).toUpperCase(Locale.ROOT)+lastName.substring(2) + lastName.substring(0,1) + "ay";

        // Making a new string with pigFirst and pigLast
        String latin = pigFirst +" " + pigLast;

        // Printing out the pigLatin String to the screen
        System.out.println(latin);

    }
}
