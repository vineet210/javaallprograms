import java.util.Scanner;

class Program
 {
    public static void main (String args[])
    {
        Scanner x = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two values : ");
        a = x.nextInt();
        b = x.nextInt();

        if (a<b)
        {
            System.out.println("second number is greater than first number.");
        }
        else
        {
            System.out.println("first number is greater than second number.");
        }

        int t, y, z;
        t = x.nextInt();
        y = x.nextInt();
        z = x.nextInt();
        boolean result;

        result = (t<y) || (z<t);
        System.out.println(result);
        result = (t<y) && (z<t);
        System.out.println(result);
    }
}