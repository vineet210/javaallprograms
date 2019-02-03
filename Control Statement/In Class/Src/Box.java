class Box
{
	static double width;
	static double height;
	static double depth;

	static void SetDim()
	{
		 depth=100; 
		 width=50;
		 height=200;
	}
	 static double volume ()
	{
		
	return (width*height*depth);

	}

}

class BoxDemo
{
	public static void main(String[] arg)
	{


	Box B = new Box();

	double d;
	B .SetDim();
	d = B.volume();
	System.out.println("d");
	
    }
}