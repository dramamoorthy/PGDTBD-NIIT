class SwapNumbersNoVar
{
public static void main(String[] args )
{
int a=5;
int b=6;

System.out.println(" the unswapped numbers are  " + a +b);
a = a+b;
b = a-b;
a = a-b;

System.out.println(" the numbers after swapping are  " +a +b);
}
}