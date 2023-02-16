public class Uppercase
{
public static void main(String args[])
{
String s="india is my country";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
}
int counter=0;
for(int j=0;j<c.length;j++)
{
if(c[j]>='a'&&c[j]<='z')
{
counter=counter+1;
}
}
System.out.println(counter+" Lower case present in the sentance");
}
}
