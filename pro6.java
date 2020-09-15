/*==============================Problem Statement==============================*/
/**
 *Write a program to illustrate the use of the method lastIndexOf() 
defined in the string API.

 */
/*==================================Solution==================================*/
import java.util.Scanner;


class pro6 {
    public static void main(final String[] args) {

         final Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the string");
         String  s = myObj.nextLine();
         System.out.println("Enter the string to be searched");
         String search = myObj.nextLine();
         System.out.println("The index of last occurence of " + search + " is " + s.lastIndexOf(search));
         System.out.println("Enter the index limit");
         int inexLimit = myObj.nextInt();
         System.out.println("First occurence of " + search + " from " + inexLimit + 
                            "th index backwards is " + s.lastIndexOf(search,inexLimit));

        myObj.close();
            
    }


}
/*===================================Sample Output===================================*/
/*
Enter the string
Amphisoft Technologies is a product company 
Enter the string to be searched
is
The index of last occurence of is is 23
Enter the index limit
20
First occurence of is from 20th index backwards is 4
 */