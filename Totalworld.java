public class Totalworld
{
public static void main(String args[])
{
String S="jayanthi regiter to school";
{
int count=0;
char c[]=new char [S.length()];
for(int i=0;i<c.length;i++)
{
c[i]=S.charAt(i);
}
for(int i=0;i<c.length;i++)
{
if(c[i]==' ')
{
count=count+1;
}
}
System.out.println(count+1);
}
}
}
