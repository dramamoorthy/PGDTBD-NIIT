class PrimeNumber
{
public static void main(String[] args)
{
int n=7;
int sign=0;
for(int i=2;i<n;i++)
{
if(n%i == 0)
{
System.out.println(" the number is not a prime number");
sign=1;
break;
}
}
if(sign == 0)
{
System.out.println("the number is a prime number");
}
}
}

