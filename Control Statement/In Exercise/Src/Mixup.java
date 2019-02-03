import java.util.Scanner;
class Mixup
{
    public static void main(String args[ ])
    {
    int i=0;
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the character : ");
    char ch=x.next( ).charAt(0);    
    switch(ch)
    {
     case  'A' :
     case 'I'  :
     case 'U'  :
     case 'o'  :
     case 'E'  :
     case  'a' :
     case 'i'  :
     case 'u'  :
     case 'O'  :
     case 'e'  :
     i++;
    }
    if(i==1)
    System.out.println("Entered character "+ch+" is  Vowel");
    else 
        if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
        System.out.println("character entered "+ch+"is consonant");
        else
        System.out.println("Not an alphabet");      
    }
}