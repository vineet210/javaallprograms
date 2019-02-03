import java.util.Scanner;

class EmployeeTest1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter total number of users : ");
        int total = scan.nextInt();
        
        Employee d1 = new Employee(total);
        d1.display();

    }
}