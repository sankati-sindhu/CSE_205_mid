/*==============================Problem Statement==============================*/
/*

Q15. To "capitalize" a string means to change the first letter of each word in the string to upper case (if it is not already upper case). For example, a capitalized version of "Now is the time to act!" is "Now Is The Time To Act!". Write a program to print the capitalized version of the input string.

 

Input and Output Format:

 

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output :

 

Enter the string

Java is an object oriented programming language 

Capitalized version:

Java Is An Object Oriented Programming Language
*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro13 {
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        int temp = s.length();
        s = s.replace("x","");
        temp -= s.length();
        s = s+ "x".repeat(temp);
        System.out.print(s);

        myObj.close();
            
    }


}
/*===================================Sample Output===================================*/
/*
Excellent AXE 
Ecellent AXEx
 */