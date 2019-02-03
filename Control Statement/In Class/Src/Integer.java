import java.util.*;

 class Integer {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number with five digits: ");  
        int num = scan.nextInt();

        for(; ;)
        {
            if (num < 10000 || num > 99999) {
                System.out.println("The entered number is not a 5 digit number. Re-enter the number : ");
                num = scan.nextInt();
            } else
                break;
        }

        System.out.printf("%d   ", (num / 10000));
        System.out.printf("%d   ", (num / 1000) % 10);
        System.out.printf("%d   ", (num / 100) % 10);
        System.out.printf("%d   ", (num % 100) / 10);
        System.out.printf("%d   ", (num % 10));
    }
}
