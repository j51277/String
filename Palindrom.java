public class Palindrom
{
public static void main(String args[])
{
String a="madam";
String x="";
for(int i=a.length()-1;i>=0;i--)
{
x=x+a.charAt(i);
}
if(a.equals(x))
{
System.out.println("palindrom");
}
else
{
System.out.println("not palindrom");
}
}
}

