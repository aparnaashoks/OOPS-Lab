import java.util.*;
class OneDimArr
{
public static void main(String args[])
{
int a[]=new int[5];
Scanner s1=new Scanner(System.in);
System.out.println("ENTER THE NUMBERS :");
for(int i=0;i<5;i++)
{
a[i]=s1.nextInt();
}
System.out.println("DISPLAYING THE ELEMENTS!!!)");
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}
