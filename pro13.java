/*==============================Problem Statement==============================*/
/*
Q13. Given a string, 
write a program to compute a new string where identical chars
that are adjacent in the original string are separated from 
each other by a "*"

 

Input and Output Format:

 

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output :

 

Enter the string

hello 

The processed string is hel*lo
*/
/*==================================Solution==================================*/
import java.util.Scanner;


class pro13 {
    public static void main(final String[] args) {

        final Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();
        for(int i =1; i<s.length();i++){
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