/*==============================Problem Statement==============================*/
/*
Q10. This program is to illustrate the use of the method 
replace() defined in the string API.

Two companies enter into a Marketing Agreement and 
they prepare an Agreement Draft. 
After that one of the companies changes its name. 
The name changes need to be made in the Agreement Draft as well. 
Write a program to perform the name changes in the agreement draft.

*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro10 {
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String  s = myObj.nextLine();
        System.out.println("Enter the old name of the company");
        String old = myObj.nextLine();
        System.out.println("Enter the new name of the company");
        String newN = myObj.nextLine();
        s.replace(old, newN);

        System.out.println(newN);


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