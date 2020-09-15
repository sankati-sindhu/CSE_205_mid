/*==============================Problem Statement==============================*/
/**
 *  WAP that will accept the size of an int array. 
    If the size is negative or less than 3 then display message "Invalid Size" and quit the program. 
    Accept input in array. Display the array in asc/descending  order.
 */
/*==================================Solution==================================*/
import java.util.Arrays;
import java.util.Scanner;

class pro1 {
        public static void main(final String[] args) {

        Scanner myObj = new Scanner(System.in);
        //inputting size of array
        int n = myObj.nextInt();
        if(n < 3){
            System.out.print("Invalid Size");
        }else{
            int[] arr = new int[n];

            //inputting array
            for(int i=0;i<n;i++){
                arr[i] =  myObj.nextInt();
            }
            Arrays.sort(arr, 0, n);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

            myObj.close();
            

        }
    }
}
/*===================================Sample Output===================================*/
/*
sample 1:
5
16
30
20
18
19
16 18 19 20 30
sample 2:
2
Invalid Size
 */