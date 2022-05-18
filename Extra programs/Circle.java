import java.util.*;
class Circle
{
double area;
Circle(double r)
{
area=2*3.14*r*r;
}
}
class AreaofCircle
{
public static void main (String args[])
{
System.out.println("Enter the radius of circle");
Scanner s1=new Scanner(System.in);
double radius=s1.nextDouble();
Circle a=new Circle(radius);
System.out.println("Area of circle is "+a.area);
}}
