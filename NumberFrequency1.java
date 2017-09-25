import java.io.*;
class NumberFrequency1
{
public static void main(String[] args)
{
int n = 54232;
int d;
int f[]=new int[10];
for(int i=0;i<10;i++)
{
f[i]=0;
}

while (n>0)
{
 d = n % 10;
 f[d]++;
 n=n/10;
}
for(int i=0;i<10;i++)
{
if (f[i]!=0)
System.out.println(" " +i+ "\t  " + f[i]);
}
}
}