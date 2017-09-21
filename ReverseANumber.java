import java.util.*;
class ReverseANumber
{
public static void main(String[] args)
{
int numb;
//int numbs;
int reverse=0;
System.out.println("Enter a number to reverse it");
Scanner numbs = new Scanner(System.in);
numb= numbs.nextInt();
while(numb!= 0)
{
int unit = numb%10;
reverse = reverse * 10 + unit;
numb /= 10;
}
System.out.println("Reversed = " + reverse);
}
}

