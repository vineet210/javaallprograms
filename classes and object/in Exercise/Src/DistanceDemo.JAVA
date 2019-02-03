class Distance
{
	float feet;
	float inch;
	float feet1;
	float inch1;

Distance ()
{
	System.out.println("");
}
Distance (float feet,float feet1 ,float inch , float inch1)
{
	this.feet=feet;
	this.feet=feet1;
	this.feet=inch;
	this.inch=inch1;

}
float getfeet()
{
	return feet;
}
float getinch()
{
	return inch;
}
float getfeet1()
{
	return feet1;
}
float getinch1()
{
	return inch1;
}
public void set(float feet,float inch)
{
	this.feet=feet;
	this.inch=inch;
}
void set(float feet, float feet1 ,float inch , float inch1)

{
	this.feet=feet;
	this.feet1=feet1;
	this.inch=inch;
	this.inch1=inch1;
}
public void sum( Distance D)
{
	float F1,I1;
	F1=getfeet()+D.getfeet1();
	I1=getinch()+D.getinch1();
	System.out.println(F1+ " "+I1);


}
}
class DistanceDemo
{
	public static void main(String args[])
	{
	Distance D1=new Distance();

	Distance D2=new Distance();

	D1.set(5,6,7,8);
	D2.set(9,10,11,12);
	D1.sum(D2);

	}
}


	