/*==============================Problem Statement==============================*/
/**
 *  WAP that will accept the size of an int array. 
    If the size is zero or negative  then display message "Invalid Size" and quit the program. 
    Accept input in array.Find all prime numbers in array. Display their average value upto 2 decimal place. 
    If no prime number found then display message "No prime number found"
 */
/*==================================Solution==================================*/
import java.util.Scanner;


class pro2 {
        public static void main(final String[] args) {

            final Scanner myObj = new Scanner(System.in);
            // inputting size of array
            final int n = myObj.nextInt();
            if (n <= 0) {
                System.out.print("Invalid Size");
            } else {
                final int[] arr = new int[n];
                int k =0,temp, sum = 0;
                // inputting array
                for (int i = 0; i < n; i++) {
                    temp = myObj.nextInt();
                    if (isPrime(temp) == 1){
                        arr[k] = temp;
                        sum += temp;
                        k++;
                    }
                }
                if(k == 0){
                    System.out.println("No prime number found");
                }
                else{
                    System.out.format("%.2f",sum/(float)(k));
                }
                myObj.close();

            }
        }

    public static int isPrime(int n) {
        for(int i =2; i< Math.sqrt(n); i++)
            if(n%i == 0){
                return 0;
            }
        return 1;
    }
}
/*===================================Sample Output===================================*/
/*
sample 1:
5
15
31
20
18
19
25.00
sample 2:
-9
Invalid Size
sample 3:
3
15
20
18
No prime number found
 */