/*==============================Problem Statement==============================*/
/*

Q9. This program is to illustrate the use of the method split() 
defined in the string API.
*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro9 {
    public static void main(final String[] args) {

         final Scanner myObj = new Scanner(System.in);
         System.out.println("Enter the string");
         String  s = myObj.nextLine();
         String[] strs = s.split();
         for(String a: strs){
             System.out.println(a);
         }
    
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