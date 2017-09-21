
import java.lang.*;
import java.io.*;
import java.util.*;

class StringReversal
{
public static void main(String[] args)
{
String str;
 Scanner str1 = new Scanner(System.in);
 System.out.println("Enter a String to reverse it");
 str=str1.next();
 
 
 char[] ctr = str.toCharArray();

 for(int i = ctr.length-1; i>=0; i--)
 System.out.print(ctr[i]);

}
}