import java.util.Scanner;
class Stack

{
	int arr[]=new int[10];
	int top;

Stack()
{
	top=-1;
}
void push(int num)
{
	if(isfull())
	{
		System.out.println("No Number is enter");

	}
	else
	{
		top++;
		arr[top]=num;
	}
}
void pop()
{
	if(isemty(	))
	{
		System.out.println("Stack is emty");
	}
	else
	{
		top--;
		System.out.println("Element is deleted");
	}
}
boolean isfull()
{
	if (top==9)
	 return true;
		
	else 
		return false;

}
boolean isemty()
{
	if(top==-1)
		return true;
	else 
		return false;

}
void spaceleft()
{
  int k;
  k=9-top;
  System.out.println("k");

}
void display()
{
	System.out.println("the elements are ");
	for(top=0;top<arr.lenght;top++)
		System.out.println(arr[top]);
}
}

class Stacktest
{
	public static void main(String args[])
	{
		int choice,num;
		int r;
		Stack S=new Stack();
		Scanner S1=new Scanner(System.in);
        do
        {
        System.out.println("enter 1 for Push\nenter 2 for Pop\n enter 3 for isfull\nenter 4 for is emty\n enter 5 for spaceleft\n enter 6 should display");
        //choice=S1.nextInt();
        
        	choice=S1.nextInt();
          switch(choice)
          {
        	case 1:
        	{
        		System.out.println("enter the number to push");
        		int y=S1.nextInt();
        		S.push(y);
        	}	break;
        	
        	case 2:
        	{
        	  S.pop();
        	}	break;
   	     	
             case 3:
            {
               S.isfull();
            }   break;
            
 
             case 4:
            {
             	S.isemty();
            }     break;
             
            case 5:
            {
            	S.spaceleft();
            }	break;
            
            case 6:
            {
            	S.display();
            }break;
            default:
            {
            	System.out.println("wrong number entered");
            }

        }
         System.out.println("if ucount enter 1 else enter 2");
         
         r=S1.nextInt();
}
 while(r==1);
}
}
  


