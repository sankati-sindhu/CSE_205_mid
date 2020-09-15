/*==============================Problem Statement==============================*/
/**
 * Accept size & values of an int  array .If the size is zero or negetive  then display message "Invalid Size" 
    and quit the program. Accept input in array, 
    1.each value must higher then 10 otherwise re-accept that number. 
    2.Find the odd numbers in it then , multiply the digits of each odd numbers and store the result 
    them in a second array in descending order. 
 */
/*==================================Solution==================================*/
import java.util.Arrays;
import java.util.Scanner;


class pro3 {
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
                    do{
                        temp = myObj.nextInt();
                    }while(temp<10);
                    if(temp%2 == 1){
                        arr[k] = proNum(temp);
                        k++;
                    }
                    
                }
                Arrays.sort(arr, 0 , k);
                for(int i =0;i<k;i++){
                    System.out.print(arr[i]+" ");
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
3
23
24
25
6 10
 */