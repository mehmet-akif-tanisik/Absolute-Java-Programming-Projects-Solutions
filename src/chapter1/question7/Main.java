package chapter1.question7;
/*

7. Write a program that outputs the number of hours, minutes, and seconds that
corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
and 51 seconds. Test your program with a different number of total seconds to
ensure that it works for other cases.

 */


public class Main {

    public static void calculateAsHoursMinutesSeconds(int total_seconds){

        int total_hours = total_seconds/3600;
        int total_minutes = (total_seconds-(3600*total_hours)) / 60;
        int remaining_seconds = total_seconds - (total_hours*3600 + total_minutes*60);

        System.out.println(total_seconds + " seconds: " + total_hours + " hours " + total_minutes + " minutes " + remaining_seconds + " seconds.");

    }

    public static void main(String[] args) {

        // Total seconds to be calculated as Hours/Minutes/Seconds
        int total_seconds = 50391;

        // 60 seconds = 1 minute   , 60 minutes = 1 hour --> 1 hour = 60*60 = 3600 seconds
        int total_hours= total_seconds/3600;

        // Total minutes = (Total seconds - (Total hours * 3600)) / 60
        int total_minutes= (total_seconds-(3600*total_hours)) / 60;

        // Remaining seconds = Total seconds - (total hours * 3600 + total minutes * 60)
        int remaining_seconds = total_seconds- (total_hours*3600 + total_minutes*60) ;

        // Printing the output to the screen
        System.out.println(total_seconds + " seconds equal to: " +total_hours + " hours " + total_minutes + " minutes and " + remaining_seconds+ " seconds" );


        // Same program written with method above with the name of calculateAsHoursMinutesSeconds()
        // Let's test the same program with different parameter using our user defined method

        System.out.println("Method test 1: ");
        calculateAsHoursMinutesSeconds(50391);
        System.out.println("Method test 2: ");
        calculateAsHoursMinutesSeconds(40678);
        System.out.println("Method test 3: ");
        calculateAsHoursMinutesSeconds(3600);

    }
}
