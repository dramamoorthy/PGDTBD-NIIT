import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrome
{
public static void main(String[] args)
{
int num1;
int revnum1=0;
System.out.println("Enter an integer");
Scanner num = new Scanner(System.in);
num1 = num.nextInt();
int sum = num1;

while(num1 > 0)
{
revnum1 = revnum1 + (num1 % 10);

revnum1 = revnum1*10;

num1 = num1/10;
}

revnum1 = revnum1/10;

System.out.println(revnum1);

if (revnum1 == sum )
{
System.out.println("the number is a palindrome");
}
else
{
System.out.println("the number is not a plaindrome");
}
}
}
 