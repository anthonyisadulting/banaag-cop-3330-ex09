package base;

/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard
rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import java.util.Scanner;

public class app {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.print("What is the length of the ceiling?");
    String input0 = in.nextLine();
    int num0 = Integer.parseInt(input0);

    System.out.print("What is the width of the ceiling");
    String input1 = in.nextLine();
    int num1 = Integer.parseInt(input1);

    double sqft = num0 * num1;

    double gallon =  Math.ceil(sqft / 350) ;







    System.out.print("You will need to purchase " + gallon + " gallons of paint to cover "
      + sqft + " square feet.");








}
}
