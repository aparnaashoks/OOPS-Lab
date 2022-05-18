import java.util.*;
class Calculator
{
public static void main (String args[])
{
int a,b,ch,c;
Scanner s1=new Scanner (System.in);
System.out.println("1.sum 2.Subtraction 3.Multiplication 4.Division");
System.out.println("Enter two numbers");
a=s1.nextInt();
b=s1.nextInt();
System.out.println("Enter the choice");
ch=s1.nextInt();
switch(ch)
{
case 1:
{
c=a+b;
System.out.println("Sum is"+c);
break;
}
case 2:
{
c=a-b;
System.out.println("Difference is"+c);
break;
}
case 3:
{
c=a*b;
System.out.println("Product is"+c);
break;
}
case 4:
{
c=a/b;
System.out.println("Quotient is"+c);
break;
}
default:
System.out.println("Invalid srtement");
}
}
}



