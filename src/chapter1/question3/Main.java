package chapter1.question3;/*
3. Write a program that starts with the string variable first set to your first name
and the string variable last set to your last name. Both names should be all lowercase.
Your program should then create a new string that contains your full name in
pig latin with the first letter capitalized for the first and last name. Use only the pig
latin rule of moving the first letter to the end of the word and adding “ay.” Output
the pig latin name to the screen. Use the substring and toUpperCase methods
to construct the new name.
For example, given

first = "walt";
last = "savitch";

the program should create a new string with the text “Altway Avitchsay” and print it.
 */


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String makePigLatinWord(String first, String last){
        String nivFirst= first.substring(1)+first.charAt(0) + "ay";
        String nivLast=last.substring(1) + last.charAt(0) + "ay";
        return nivFirst.substring(0,1).toUpperCase(Locale.ROOT)+nivFirst.substring(1) + " " +
                nivLast.substring(0,1).toUpperCase(Locale.ROOT) + nivLast.substring(1);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName=scanner.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName=scanner.nextLine();
        System.out.println(makePigLatinWord(firstName,lastName));
    }
}
