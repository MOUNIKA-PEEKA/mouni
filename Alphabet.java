import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Alphabet
{
    public static void main (String[] args) throws java.lang.Exception
    {
        char al;
        Scanner scan = new Scanner(System.in);
        al = scan.next().charAt(0);
        if((al>='a' && al<='z') || (al>='A' && al<='Z'))
        {
            System.out.print(al+ " \nAlphabet");
        }
        else
        {
            System.out.print(al+ "\nNo");
        }
    }
}


