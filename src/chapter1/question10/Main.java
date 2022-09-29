package chapter1.question10;/*

10. Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose. Write a program with a variable that holds the number of milligrams
of caffeine in a drink and outputs how many drinks it takes to kill a person.
A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

 */


public class Main {
    private static final int LETHAL_OVERDOSE=1000;


    public static int calculateNumberOfDrinks(int caffeineConsumptionInDrink){
        return LETHAL_OVERDOSE/caffeineConsumptionInDrink;
    }

    public static void main(String[] args) {

        // Variables for caffeine consumptions in cola and cup of coffee
        int caffeineInCola = 34;
        int caffeineInCoffee = 160;
        // Variables for number of cola can & cup of coffee it takes to kill a person
        int numberOfColaCan= LETHAL_OVERDOSE / caffeineInCola;
        int numberOfCoffeeCup = LETHAL_OVERDOSE / caffeineInCoffee;

        // Printing the output to the screen
        System.out.println("Number of cola can it takes to kill a person: "+numberOfColaCan);
        System.out.println("Number of cup of coffee can it takes to kill a person: "+numberOfCoffeeCup);

        // Method to calculates number of drinks it take to kill person (calculateNumberOfDrinks(int caffeineConsumptionInDrink)).
        System.out.println("Method Tests-------------------------");
        System.out.println("Number of cola can it takes to kill a person: " + calculateNumberOfDrinks(34));
        System.out.println("Number of cup of coffee can it takes to kill a person: " + calculateNumberOfDrinks(160));

    }
}
