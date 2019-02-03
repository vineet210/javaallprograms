import java.util.Scanner;
class Box
{
	float widht;
	float height;
	float depth;
 	Box()
 	{
 		widht=0;
 		height=0;
 		depth=0;

 	}
 	Box(float widht, float height, float depth)
 	{
 		this.widht=widht;
 		this.height=height;
 		this.depth=depth;
 	}
	Box(float widht , float height )
	{
		this.widht=widht;
 		this.height=height;
	}
	 float getwidht()
     {
     	return widht;
     }
     float getheight()
     {
     	return height;
              
     }
     float getdepth()
     {
     	return depth;

     } 
     void setdimension(float widht, float height , float depth)
     {
     
     	this.widht=widht;
 		this.height=height;
 		this.depth=depth;	

     }
     float display()
     {
     	float volume;
     	volume=getdepth()*getheight()*getweight();
     	System.out.prinln("enter the value");
	
	}
	
}     


  

class BoxWeight extends Box
{
	float weight;
	BoxWeight()
	{
		super();

	}
     
     BoxWeight(float widht, float height, float depth , float weight)
     {
     	super(widht,height, depth );
     	this.weight=weight;
     }
     BoxWeight(float wight, float height)
     {
     	super(widht, height);

     }
     void setdimension(float widht, float height , float depth,float weight)
     {
     
     	super(widht,height,depth);
     	this.weight=weight;


     }
     

     void display()
	{
		weight=getdepth()*getwidht()*getheight()*getweight();
		System.out.prinln("enter the value");

	}
}	

class BoxWeightDemo
{
	public static void main(String args[])
	{
		BoxWeight b=new BoxWeight();
		BoxWeight b1=new BoxWeight();
		BoxWeight b2=new BoxWeight(3,4,5,6);
		Scanner S = new Scanner(System.in);
		
		System.out.prinln("enter width ");
		widht=S.nextFloat();  
		System.out.prinln("enter depth ");
		depth=S.nextFloat();
		
		System.out.prinln("enter height ");
		height=S.nextFloat();  
		
		System.out.prinln("enter weight ");
		weight=S.nextFloat();  
		
			b.setdimension(widht,height,depth);
		b.display();
	}	
}