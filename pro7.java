/*==============================Problem Statement==============================*/
/**
 Write a program to illustrate the use of the method startsWith() 
defined in the string API.


 */
/*==================================Solution==================================*/
import java.util.Scanner;


class pro7 {
    public static void main(final String[] args) {

         final Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the string");
         String  s = myObj.nextLine();
         System.out.println("Enter the start string");
         String start = myObj.nextLine();
         if(s.startsWith(start))
         System.out.println(s+ " start with " + start);
         else System.out.println(s+ " does not start with " + start);
    

        myObj.close();
            
    }


}
/*===================================Sample Output===================================*/
/*
Enter the string
Enter the string
Amphisoft
Enter the start string
Amphi
Amphisoft start with Amphi
 */