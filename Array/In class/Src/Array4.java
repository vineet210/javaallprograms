import java.util.Scanner;

public class Array4 
{
    static Scanner scan = new Scanner(System.in);

    static void function()
    {
        int x[] = new int[5];

        for (int i=0; i<5; i++)
        {
            System.out.println(" Enter a number between 10-100 : ");
            x[i]=scan.nextInt();

            if (x[i]<10 || x[i]>100)
            {
                System.out.println(" Re-enter the number between 10-100: ");
                for (;;)
                {
                    x[i] = scan.nextInt();
                    if (x[i]>10 && x[i]<100)
                    {
                        break;
                    }
                    else
                        System.out.println(" Re-enter the number between 10-100: ");
                }
            }
        }
        for (int i=0; i<5; i++)
        {
            if(x[i]==x[0])
            {
                System.out.print(x[i] + " ");
            }

            for (int j=0; j<5;j++)
            {
                i++;
                if (x[i]==x[j])
                    continue;
                else
                {   System.out.print(x[i] + " ");
                    i--;
                    break;
                }
            }
        }
    }

    public static void main (String args[])
    {
        function();
    }
    }