/*==============================Problem Statement==============================*/
/*
Q12. Write a program to print the input string vertically both 
forwards and backwards.
*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro12 {
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        for(int i =0, j = s.length() -1; i<s.length();i++,j--){
            System.out.print(s.charAt(i));
            System.out.println(s.charAt(j));
        }

        myObj.close();
            
    }


}
/*===================================Sample Output===================================*/
/*
As
me
pi
hg
io
sl
oo
fn
th
 c
Te
eT
c 
ht
nf
oo
ls
oi
gh
ip
em
sA
 */