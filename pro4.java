/*==============================Problem Statement==============================*/
/**
 * wap that will accept a number between 1000 and 10000000. 
Display second smallest digit.
 */
/*==================================Solution==================================*/
import java.util.Scanner;


class pro4{
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        // inputting size of array
        int n = myObj.nextInt();
        if (n < 1000 && n > 10000000) {
            System.out.print("Invalid input");
        } else {
            int min = n%10, min2 = n%10;
            n = n/10;
            while(n != 0){
                if(min > n%10){
                    min2 = min;
                    min = n%10;
                }else if(min2 > n%10 || min2 == min){
                    min2 = n%10;
                }
                n = n/10;
            }
            System.out.println(min2);
        }

        myObj.close();
    }

    
}
/*===================================Sample Output===================================*/
/*
sample 1:
6481937
3
 */