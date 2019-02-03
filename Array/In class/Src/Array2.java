import java.util.Scanner;

public class Array2 {
    static Scanner scan = new Scanner(System.in);

    static void function()
    {
        int x[] = new int[10];

        for (int i=0; i<10;i++)
        {
            System.out.println(" Enter the " + i + " element of array : ");
            x[i] = scan.nextInt();
        }
        System.out.println(" Enter the number you wish to search : ");
        int num;
        num = scan.nextInt();
        System.out.println(ArraytoString(x));
        for (int i=0; i<10;i++)
        {
            if (x[i]==num)
            {
                System.out.println(" The entered number is present at " + (i + 1) + " location.");
                System.exit(0);
            }
        }
        System.out.println("  ");

    }

    public static void main(String args[])
    {
        function();
    }
}