import java.util.*;
class armstrong
{
int number(int arm)
{int sum=0,p;
int z= arm;
while(z>0)
{
p=z%10;
sum=sum+(p*p*p);
z=z/10;
}
if(sum==arm)
{System.out.println("the number is armstrong");
return 1;}
else
{System.out.println("the number is not armstrong");
return 0;
}
}
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number you want to check");
int a=ob.nextInt();
armstrong obj=new armstrong();

obj.number(a);
}}
