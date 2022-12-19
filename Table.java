import java.lang.*;
import java.util.*;
class Table
{
public static void main(String...args)
{
int i,c,a;

Scanner S=new Scanner(System.in);

System.out.println("enter table number");
 a=S.nextInt();
for(i=1;i<=10;i++)
{
c=i*a;
System.out.println("table is"+c);
}
}
}
