import java.util.Scanner;

class MotorTest {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println(" Enter the number of tyres : ");
        int n = x.nextInt();

        switch (n)
        {
            case 2:
                Bike b = new Bike();
                b.display();
                break;
            case 4:
                Car c = new Car();
                c.display();
                break;
            default:
                Vehicle v = new Vehicle();
                vimport java.util.Scanner;
        }
    }       
          