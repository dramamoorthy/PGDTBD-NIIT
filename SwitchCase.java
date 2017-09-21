import java.io.*;
import java.util.*;
class SwitchCase
{
public static void main(String[] args)
{
Scanner num=new Scanner(System.in);
char c;
int a=5;
int b=10;
int answer=0;
System.out.println("enter a character among *,-,+,/,%");
c=num.next().charAt(0);
switch( c)
{
case '*':

 answer=a*b;
 System.out.println(answer);
 break;
default:
 System.out.println("enter valid operator");

case '-':

 answer=a-b;
 System.out.println(answer);
 break;

case '+':

 answer=a+b;
 System.out.println(answer);
 break;

case '/':

 answer=a/b;
 System.out.println(answer);
 break;

case '%':

 answer=a%b;
 System.out.println(answer);
 break;
}
}
}         