import java.util.Scanner;
import java.lang.Scanner;

public class Array4
 {
    static Scanner scan = new Scanner(System.in);

    static void getgrades(int array[][]) {
        int grade = 0;

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("\nEnter grades for student :", i + 1);
            for (int j = 0; j < 5; j++)
            {
                System.out.println("Enter grade on test " + j + 1 + " (0-100): ");
                grade = scan.nextInt();
                while(grade<0 || grade>100)
                {
                    System.out.println(" GRADE NOT BETWEEN 0-100! Kindly enter grade again : ");
                    grade = scan.nextInt();
                }

                array[i][j] = grade;
            }


        }
    }

    static void displaygrades(int array[][])
    {
        double studentTotal = 0.0, testTotal = 0.0,classTotal = 0.0;
        System.out.println(" Grade Sheet ");
        System.out.printf(" %15 Student number %10 Test 1 %10 Test 2 %10 Test 3 %10 Average");

        for (int i=0; i<10; i++)
        {
            System.out.printf(" %15d ", i+1);

            for (int j=0;j<5;j++)
            {
                int grade = array[i][j];
                System.out.printf(" %10d ", grade);
                studentTotal+=grade;
                classTotal+=grade;
            }
            System.out.println(studentTotal/5);
            studentTotal=0.00;
        }

        System.out.printf(" %15 Test average ");
    }

    public static void main(String args[])
    {
        int studentgrades [][] = new int[10][5];
        getgrades(studentgrades);
        displaygrades(studentgrades);
    }
}