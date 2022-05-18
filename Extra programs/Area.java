import java.io.*;
import java.util.*;
class Area
{
void findArea(int a,int b)
{
System.out.println("\n Area of rectangle   with breadth "+a+"and length"+b+"is:"+a*b);
}
void findArea(int a)
{
System.out.println("\n Area of circle with radius "+a+"is:"+3.14*a);
}
void findArea(int a,int b, int c)
{
double temp=(a+b+c);
double s=temp/2;
double triarea=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("\n Area of triangle with length of sides "+a+","+b+" and "+c+"is:"+triarea);
}
public static void main(String p[])throws IOException
{
Scanner c=new Scanner(System.in);
Area d=new Area();
System.out.println("\n find area of\n1.Rectangle \n2.Triangle \n3.circle\n\nSelect a choice:");
int choice =c.nextInt();
switch(choice)
{
case 1:
System.out.println("\n Enter the breadth :");
int b=c.nextInt();
System.out.println("\n Enter the length :");
int l=c.nextInt();
d.findArea(b,l);
break;
case 2:
System.out.println("\n Enter the length of first side:");
int l1=c.nextInt();
 System.out.println("\n Enter the length of second side:");
int l2=c.nextInt();
System.out.println("\n Enter the length of third side:");
int l3=c.nextInt();
d.findArea(l1,l2,l3);
break;
case 3:
System.out.println("\n Enter the radius:");
int r=c.nextInt();
d.findArea(r);
break;
default:
System.out.println("Invalid choice");
}
}}
