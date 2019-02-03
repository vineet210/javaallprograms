import java.util.Scanner;
import java.lang.Math;
class Equation

{ 
  public static void main(String arg[])
  {
   int a, b, c;
   double d , root1 ,root2;

    Scanner f=new Scanner (System.in);

   System.out.println("enter the value of a b c ");
System.out.println("enter the value a");

   a=f.nextInt();

   System.out.println("enter the value b");

   b=f.nextInt();

    System.out.println("enter the value c");

   c=f.nextInt();
   d=b*b-4*a*c;
   if (d>=0)
   {
   System.out.println("the roots are real and unreal");
   root1=(-b+(Math.sqrt(d)))/2*a;
   root2=(-b-(Math.sqrt(d)))/2*a;
System.out.println("root1="+root1 + "root2="+root2);

   }
   else if(d<0)
   {
   System.out.println("the roots are complex");
   }
  }
}