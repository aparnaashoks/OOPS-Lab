import java.util.*;
class SortString1
{
public static void main(String[]args)
{
int i,j;
Scanner z=new Scanner(System.in);
System.out.println("enter the number of words");
int num=z.nextInt();
String word[]=new String[num];
z.nextLine();
for(i=0;i<num;i++)
{
System.out.println("\n Enter a word\n");
word[i]=z.nextLine();
}
for(i=0;i<num-1;i++)
{
for(j=i+1;j<num;j++)
{
if(word[i].compareTo(word[j])>0)
{
String temp=word[i];
word[i]=word[j];
word[j]= temp;
}
}
}
System.out.println("sorted String using compareTo function="+Arrays.toString(word));
z.close();
}
}
