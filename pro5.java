/*==============================Problem Statement==============================*/
/**
 *Wap the will accept the size and elements in an int array. 
*Find the repeating elements & arrange them in acsending order 
in an output array.
*If the size is zero or negetive then display 
"Invalid Size",
*if no repeating elements then display message "No Repeated Elements" 
*if any element in input array is 0 or negetive then display message
 "Invalid Input".
 */
/*==================================Solution==================================*/
import java.util.Scanner;

import java.util.Arrays;


class pro5 {
        public static void main(final String[] args) {

            final Scanner myObj = new Scanner(System.in);
            // inputting size of array
            final int n = myObj.nextInt();
            if (n <= 0) {
                System.out.print("Invalid Size");
            } else {
                final int[] arr = new int[n];
                int k =0,temp;
                // inputting array
                for (int i = 0; i < n; i++) {
                    temp = myObj.nextInt();
                    if(temp <= 0){
                        System.out.print("Invalid Input");
                    }
                    else{
                        arr[k] = temp;
                        k++;
                    }
                    
                }
                Arrays.sort(arr, 0 , k);
                for(int i =0;i<k;i++){
                    if(arr[i] == arr[i+1]){
                        System.out.println();
                    }
                }
            }
            myObj.close();
        }

    public static int proNum(int n) {
        int prod  =1;
        while(n!=0){
            prod = prod * (n%10);
            n = n/10;
        }
        return prod;
    }
}
/*===================================Sample Output===================================*/
/*
sample 1:
6481937
3
 */