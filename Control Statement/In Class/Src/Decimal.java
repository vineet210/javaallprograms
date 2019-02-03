import java.util.Scanner;
 class Decimal
 {
    
  public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double z = x.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = x.nextDouble();

        z = Math.round(z * 1000);
        z = z / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (z == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
