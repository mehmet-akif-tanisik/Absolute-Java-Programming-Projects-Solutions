package chapter1.question8;/*

8.  The following program will compile and run, but it uses poor programming style.
Modify the program so that it uses the spelling conventions, constant naming
conventions, and formatting style recommended in this book.

public class vehicleAvgSpeed {
public static void main(String[] args)
{
double TIME;
System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
TIME = 20.5;
AVERAGE_SPEED = distance / TIME;
System.out.println("Car average speed is " + AVERAGE_SPEED
+ " miles per hour.");
}
public static final double distance = 180;
}

 */



public class VehicleAvgSpeed {

    public static final double DISTANCE = 180;

    public static void main(String[] args) {

        double time=20.5;
        System.out.println("This program calculates vehicle average speed given a time and distance traveled.");

        double avarageSpeed = DISTANCE / time;
        System.out.println("Car average speed is " + avarageSpeed + " miles per hour.");
    }

    }


// 1.  vehicleAvgSpeed = VehicleAvgSpeed --> commonly class names start with uppercase letter
// 2.  TIME = time --> variables, methods, objects names start with lowercase letter
// 3.  distance = DISTANCE --> defined constants generally named with uppercase letters
// 4.  AVARAGE_SPPED = double avarageSpeed OR double avarage_speed --> variable should be decleared with type.
//     Also commonly we do not use uppercase letters for variables declerations ( except constant variables ).