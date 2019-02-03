import java.util.Scanner;

public class Array2 
{
    static Scanner scan = new Scanner(System.in);

    static void menu(int x[])
    {
        int y;
        System.out.println("                 MENU                ");
        System.out.println(" Choose one of the choices : ");
        System.out.println(" ");
        System.out.println(" 1. Display elements of the array ");
        System.out.println(" 2. Sum of all the elements of the array ");
        System.out.println(" 3. Largest number in the array ");
        System.out.println(" 4. Smallest number in the array ");
        System.out.println(" 5. Second largest number in the array ");
        System.out.println(" 6. Sum of alternate elements in the array ");
        System.out.println(" 7. Count of even numbers in the array ");
        System.out.println(" 8. Occurrence of a number in the array ");
        System.out.println(" ");
        System.out.println(" Enter your choice : ");
        y = scan.nextInt();

        switch (y)
        {
            case 1:
                System.out.println("The elements of the array are : ");
                for(int i = 0; i < 5; i++)
                    Arrays.toString(x);
                break;

            case 2 :
                System.out.println(" Sum of all elements of the array are : ");
                int sum = 0;
                for (int i = 0; i < 5; i++)
                    sum+=x[i];
                System.out.println(sum);
                break;

            case 3 :
                Arrays.sort(x);
                System.out.println(" The largest number in array is : " + x[4]);
                break;

            case 4 :
                Arrays.sort(x);
                System.out.println(" The smallest number in array is : " + x[0]);
                break;

            case 5 :
                Arrays.sort(x);
                System.out.println(" The second largest number in the array is : " + x[3]);
                break;

            case 6 :
                sum=0;
                for(int i=0; i<5; i++)
                {
                    sum+=x[i];
                    i++;
                }
                System.out.println(" Sum of alternate elements of array is : " + sum);
                break;

            case 7 :
                int count=0;
                for(int i=0; i<5; i++)
                {
                    if(x[i]%2==0)
                        count++;
                }
                System.out.println(" Total even numbers are : " + count);
                break;

            case 8 :
                System.out.println(" Enter the number you want to check : ");
                int n = scan.nextInt();
                count = 0;
                for(int i=0; i<5; i++)
                {
                    if(x[i]==n)
                        count++;
                }
                if(count==0)
                    System.out.println(" The entered number is not in array ");
                else
                    System.out.println(" The entered number is occurring : " + count + " times. ");
                break;

        }

    }

    public static void main(String args[])
    {
        int x[] = new int[5];
        int i;
        for(;;)
        {
            for (i = 0; i < 5; i++) {
                System.out.println("Enter number " + i + " : ");
                x[i] = scan.nextInt();
            }
            menu(x);
            System.out.println(" ");
            System.out.println(" Do you want to try again or exit? ");
            System.out.println(" Enter Y to try again or N to exit");
            String s= scan.next().toLowerCase();

            if(s.charAt(0)=='n')
                System.exit(0);

        }

    }
}