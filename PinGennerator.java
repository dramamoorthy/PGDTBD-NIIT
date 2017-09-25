//Generate a pin number with name, number, Special Character(@,$,#etc). Sum of the numbersis the first character, first and last letter of the name is the 3rd and 4th character.Last letter of the pin is the special character to the last digit of the number.//
import java.util.*;
class PinGennerator
{
public static void main(String [] args)
{
String name;
int num;
int remind;
int sum=0;

char[] ctr2={'*','#','$','%','^','&','@','_','~'};
//char[] ctr;
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
name = s.next();
System.out.println("Enter a number");
num = s.nextInt();
int num1=num;
//int[] intarray = new int[num.length];
char [] ctr=name.toCharArray();
//for(int i=0;i<ctr.length;i++)
//System.out.println(name+num+ctr[i]);
while (num>9)
{
sum=0;
while(num>0)
{
remind = num%10;
sum = sum+remind;
num = num/10;
}
num = sum;
}
//for(int j=0;j<ctr.length;j++)
//System.out.println(name+num+ctr[j]);
System.out.println("Your password is");
System.out.print(num);
System.out.print(ctr[0]);
System.out.print(ctr[ctr.length-1]);
System.out.print(ctr2[num1%10]);
}
}