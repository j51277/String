public class Variablestring
{
public static void main (String args[])
{
String s="I love india";
char a[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
a[i]=s.charAt(i);
}
for(int i=0;i<s.length();i++)
{
if(a[i]=='I')
{
a[i]='i';
}
}
for(int j=0;j<s.length();j++)
{
System.out.println(a[j]);
}
}
}
