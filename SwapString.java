class SwapString
{
public static void main(String[] args)
{
String a = "Good";
String b = "Morning";

System.out.println("Before swapping   " + a +b);

a = a+b;
b =  a.substring(0,a.length()-b.length());
a = a.substring(b.length());

System.out.println("after swapping   " + a +b);
}
}

