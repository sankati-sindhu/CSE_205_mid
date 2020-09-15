/*==============================Problem Statement==============================*/
/*
Q11. Write a program to remove multiple spaces in a string.

*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro11 {
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        String before = myObj.nextLine();
        String after = before.trim().replaceAll(" +", " ");
        System.out.println(after);

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