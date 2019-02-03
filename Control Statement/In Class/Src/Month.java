import java.util.*;
import java.lang.Math;

class Month
{
	public static void main(String arg[])
	{
	int x;
	int y=0;
	Scanner month =new Scanner(System.in);

	do
	{
	System.out.println("enter the number from 1 to 12");
	y=month.nextInt();

	if ((y>=1)&&(y<=12))
	{
	switch(y)
	{
	case 1:
	System.out.println("its JANUARY");
	break;
	case 2:
	System.out.println("its feb");
	break;
	case 3:
	System.out.println("its MARCH");
	break;
	case 4:
	System.out.println("its APRIL");
	break;
	case 5:
	System.out.println("its MAY");
	break;
	case 6:
	System.out.println("its JUNE");
	break;
	case 7:
	System.out.println("its JULY");
	break;
	case 8:
	System.out.println("its AUGUST");
	break;
	case 9:
	System.out.println("its SEPTEMBER");
	break;
	case 10:
	System.out.println("its OCTOBER");
	break;
	case 11:
	System.out.println("its NOVEMBER");
	break;
	case 12:
	System.out.println("its DECEMBER");
	break;

	}
	}

	else
	{
	System.out.println("its incorrect");
	}
	Scanner enter=new Scanner(System.in);
	System.out.println("want to continue for that enter 1.NO , 2.YES");
	x=enter.nextInt();
	}while(x==1);


	}
}