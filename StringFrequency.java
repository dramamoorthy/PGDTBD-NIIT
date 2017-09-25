class StringFrequency
{
public static void main(String[] args)
{
String str="asdfkjaeijdskldklsf";
int length = str.length();
char ch;
int c=0;
for(char i='a';i<='z';i++)
{
c=0;
for(int j=0;j<length;j++)
{
ch=str.charAt(j);
if(ch==i)
c++;
}
if(c!=0)
{
System.out.println(i+"\t\t"+c);
}
}
}
}