import java.util.Scanner;
class Triangle

{ public static void main(String args[])

 {       System.out.println("Enter the number of rows:");

        Scanner x = new Scanner(System.in);

        int rows = x.nextInt();

        for(int i = 0; i < rows; i++)

        {int number = 1;

            System.out.format("%" + (rows-i) * 2 + "x" , "");

               for(int j = 0; j <= i; j++)
                               {

                   System.out.format("%4d",number);

                   number = number * (i - j) / (j + 1);

                }

            System.out.println();
            }
            }
            }