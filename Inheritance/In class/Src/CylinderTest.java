import java.util.Scanner;

public class CylinderTest 
{

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println(" Enter the radius : ");
        double radius = x.nextDouble();
        System.out.println(" Enter the height : ");
        double height = x.nextDouble();

        cylinder c = new cylinder();

        c.setRadius(radius);
        c.setHeight(height);

        System.out.println(" Radius : "+obj.getRadius());
        System.out.println(" Height : "+obj.getHeight());
        System.out.println(" Base Area : "+obj.getArea());
        System.out.println(" Volume : "+obj.getVolume());

    }

}