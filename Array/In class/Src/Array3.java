import java.util.Scanner;

public class Array3
 {
    static Scanner x = new Scanner(System.in);

    public static void main(String args[])
    {
        int y[] = new int[5];

        for (int i=0; i<5; i++)
        {
            System.out.println(" Enter a number between 10-100 : ");
            y[i]=x.nextInt();

            if (y[i]<10 || y[i]>100)
            {
                System.out.println(" Re-enter the number between 10-100: ");
                for (;;)
                {
                    y[i] = x.nextInt();
                    if (y[i]>10 && y[i]<100)
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
            if(y[i]==y[0])
              {
                 System.out.print(y[i] + " ");
              }

            for (int j=0; j<5;j++)
             {
                 i++;
                if (y[i]==y[j])
                    continue;
                else
                {   System.out.print(y[i] + " ");
                    i--;
                    break;
                }
             }
        }
    }
}