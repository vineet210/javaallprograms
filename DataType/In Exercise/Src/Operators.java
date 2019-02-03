import java.util.Scanner;

class Operators
{
    public static void main (String args[])
    {
        int a, b;
        int result;
        Scanner x = new Scanner(System.in);

        System.out.print("Enter The two Numbers : ");
        a = x.nextInt();
        b = x.nextInt();

        result = a+b;
        System.out.println(" Addition = " +result);

        result = a-b;
        System.out.println(" Subtraction = " +result);

        result = a*b;
        System.out.println(" Multiplication = " +result);

        result = a/b;
        System.out.println(" Division = " +result);

        result = a%b;
        System.out.println(" Modulus = " +result);
    }
}