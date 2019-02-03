class Circle
{
	double radius;
	String color= "red";

	Circle()
	{
	radius=0;
	}
	Circle(double radius)
	{
	this.radius= radius;
	}

	Circle(double radius, String color)
    {
    this.radius=radius;
    this.color=color;
    }

double getradius()
{
	return radius;

}
String getcolor()
{
	return color;

}
void setradius( double radius)
{
	this.radius=radius;

}

void setcolor( String color)
{
	this.color=color;
}

double getarea()
{
	return(3.14*getradius()*getradius());

}
}
class Cylinder extends Circle
{
	double height;
Cylinder()
{
height=1;	
}
Cylinder(double radius )
{
	super(radius);

}
Cylinder(double radius, double height)
{
	super(radius);
	this.height=height;
} 
Cylinder(double radius , double height, String color)
{
	super(radius,color);
	this.height=height;

}
double getheight()
{
	return height;

}
double getvolume()
{
	return (3.14*getradius()*getradius()*getheight());

} 
void setheight(double height)
{
	this.height=height;
}

}
class Test
{
	public static void main(String args[])
	{

	Cylinder c=new Cylinder();
	Cylinder c1=new Cylinder(5);
	Cylinder c2=new Cylinder(5,10);
	Cylinder c3=new Cylinder(5,10,"voilet");

	
	c.setradius(10);
	c.setheight(20);
	System.out.println(c.getvolume());
    System.out.println(c.getarea());
}
}