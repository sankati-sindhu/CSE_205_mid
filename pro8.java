/*==============================Problem Statement==============================*/
/*Q8. Write a program to illustrate the use of the method endsWith() 
defined in the string API.
*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro8 {
    public static void main(final String[] args) {

         final Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the string");
         String  s = myObj.nextLine();
         System.out.println("Enter the end string");
         String end = myObj.nextLine();
         if(s.endsWith(end))
         System.out.println(s+ " ends with " + end);
         else System.out.println(s+ " does not end with " + end);
    
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