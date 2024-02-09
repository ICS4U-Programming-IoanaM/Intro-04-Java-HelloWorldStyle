/*
* A program that as
*
* @author  Ioana Marinescu
* @version 1.0
* @since   2024 02 08
*/

import java.util.Scanner;

// class for today's lesson'
public class HelloWorldStyle {
    int userNum;
    // constructor
    public HelloWorldStyle() {
        // scanner creation
        Scanner sc = new Scanner(System.in);

        // Asks user for a number
        System.out.println("Enter a number:");
        userNum = sc.nextInt();
        sc.close();
    }

    // function that tells user what number they entered
    public void numberOutput() {
        // displays number user entered
        System.out.println("You entered the number: " + userNum);
    }
}
