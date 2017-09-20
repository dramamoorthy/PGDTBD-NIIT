import java.util.*;
class FourNumbers
{
public static void main(String args[])
{
Scanner numa =new Scanner(System.in);
int i=1;
int a,b,c,d;
System.out.println("enter four numbers");
a=numa.nextInt();
b=numa.nextInt();
c=numa.nextInt();
d=numa.nextInt();
System.out.print(a);
System.out.print(b);
System.out.print(c);
System.out.println(d);
if(a==13)
{
System.out.println(c+d);
}
else if(b==13)
{
System.out.println(d+a);
}
else if(c==13)
{
System.out.println(a+b);
}
else if(d==13)
{
System.out.println(b+c);
}
else{
System.out.println(a+b+c+d);
}
}
}
