import java.util.Scanner;

class EmployeeTest
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[])
    {
            String fname, lname, fname1, lname1;
            double mnthslry, mnthslry1;
            System.out.println(" Enter first name of employee 1 : ");
            fname = scan.next();
            System.out.println(" Enter last name of employee 1 : ");
            lname = scan.next();
            System.out.println(" Enter monthly salary of employee 1 : ");
            mnthslry = scan.nextInt();

            Employee d1 = new Employee(fname,lname,mnthslry);

            d1.raiseSalary();
            d1.display();

            System.out.println(" ");

            System.out.println(" Enter first name of employee 2 : ");
            fname1 = scan.next();
            System.out.println(" Enter last name of employee 2 : ");
            lname1 = scan.next();
            System.out.println(" Enter monthly salary of employee 2 : ");
            mnthslry1 = scan.nextInt();
            Employee d2 = new Employee(fname1,lname1,mnthslry1);
            d2.raiseSalary();
            d2.display();
    }
}