import java.util.Scanner;

class Circle
{
    double radius;

    Circle()
    {
        radius=1;
    }

    Circle(double radius)
    {
        this.radius=radius;
    }

    double area(double radius)
    {
        return 3.14*radius*radius;
    }

    double circumference (double radius)
    {
        return 2*3.14*radius;
    }

    void display()
    {
        System.out.println(" The area is : "+ area(radius));
        System.out.println(" The circumference is : "+ circumference(radius));
    }
}

public class CircleTest {

    static Scanner x = new Scanner(System.in);
    public static void main(String args[])
    {
        double radius;
        System.out.println(" Enter radius : ");
        radius = x.nextDouble();
        Circle c = new Circle(radius);
        c.area(radius);
        c.circumference(radius);
        c.display();
    }
}