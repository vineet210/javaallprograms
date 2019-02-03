import java.util.Scanner;

public class Array1 {
    static Scanner x = new Scanner(System.in);

    public static void main(String args[])
    {
        int a,i,j,r,c;

        System.out.println("Enter the number of rows : ");
        r = x.nextInt();
        System.out.println("Enter the number of columns : ");
        c = x.nextInt();

        int y[][]= new int[r][c];

        for ( i = 0; i < r; i++)
        {
            for ( j = 0; j < c; j++)
            {
                System.out.println("Enter a 2 digit number : ");
                a = x.nextInt();

                for(; ;)
                {
                    if (a >= 10 && a <= 99)
                    {
                        y[i][j] = a;
                        break;
                    }
                    else
                    {
                        System.out.println(" Number is not 2-digits. Enter the number again : ");
                        a = x.nextInt();
                    }
                }

            }

        }

        System.out.println("Entered array : ");
        for (i=0;i<r;i++)
        {
                System.out.println("(y[i])");
        }
        System.out.println("Array after multiplying each odd element by 2 : ");
        for (i=0;i<r;i++)
        {
            for (j=0;j<r;j++)
            {
                if(y[i][j]%2 ==0 )
                    continue;
                else
                    y[i][j]*=2;
            }
        }
        for (i=0;i<r;i++)
        {
            System.out.println("y[i]");
        }

    }
}