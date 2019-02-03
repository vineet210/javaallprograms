import java.util.Scanner;

class Date
{
    int month, day, year;

    Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }

    Date(int month, int day, int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    void displayDate()
    {
        System.out.println(" The date is : "+ day + "/"+month+"/"+year);
    }
}
public class DateTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
        int month, day, year, n1, n2, n3;

        System.out.println(" Enter day : ");
        n1 = scan.nextInt();

        for (;;)
        {
                if (n1 >= 1 && n1 <= 31) {
                    day = n1;
                    break;
                }
                else {
                    System.out.println(" Re-enter day : ");
                    n1 = scan.nextInt();
                }
        }

        System.out.println(" Enter month : ");
        n2 = scan.nextInt();
        for (;;)
        {
                if (n2 >= 1 && n2 <= 12)
                {   month = n2;
                    break;
                }
                else
                {
                    System.out.println(" Re-enter month : ");
                    n2 = scan.nextInt();
                }
        }

        System.out.println(" Enter year : ");
        year = scan.nextInt();

        Date ob1= new Date(month,day,year);
        ob1.displayDate();
    }
}