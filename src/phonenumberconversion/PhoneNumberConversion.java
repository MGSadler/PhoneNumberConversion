
package phonenumberconversion;

import java.util.Scanner;

public class PhoneNumberConversion {

    
    public static void main(String[] args) {
        
        /*The following pseudocode describes how to turn in a string containing a ten-digit phone number
        * (such as "4155551212") into a more readable string with paranthesis and dashes, like this:
        * "(415) 555-1212".
        */
        
        /* Take the substring consisting of the first three characters and surround it with "(" and ")".
        * This is the area code
        */
        
        /* Concatenate the area code, the substring consisting of of the next three characters,
        * a hyphen, and the substring consisting of the last four characters.  This is the formatted number.
        */
        
        /* Translate this pseudocode into a Java program that reads a telephone number into a
        * string variable, computes the formatted number, and prints it.
        */
        
        System.out.print("Enter a ten-digit phone number: ");
        Scanner in = new Scanner(System.in);
        String phoneNumber;
        phoneNumber = in.nextLine();
        System.out.print("The formatted number is: ");
        System.out.println("(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10));
        
    }
    
}
