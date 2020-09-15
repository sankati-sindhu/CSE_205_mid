/*==============================Problem Statement==============================*/
/*

Q14. Given a string, 
write a program to compute a new string where all 
the lowercase 'x' chars have been moved to the end of the string.

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