import java.util.*;
class Series
{  
public static void main(String[] args) 
{ 
    int i,n,multi=1,t=1,y;
    Scanner x = new Scanner(System.in);
        System.out.print("Enter a base: ");
        y= x.nextInt();
        System.out.print("Enter the value of n : ");
        n= x.nextInt();

    
    for (i = 1; i <= n; i++)  
    { 
        t = t + multi / i; 
        multi = multi * y; 
    } 
    
     System.out.printf("the sum is " +t); 

} 
}