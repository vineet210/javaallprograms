import java.io.*;
import java.util.*;

class Stack
{
    static Scanner scan = new Scanner(System.in);
    static int size;
    // Pushing elements
    static void stack_push(Stack<Integer> stack)
    {
        System.out.println(" Enter size of stack : ");
        size = scan.nextInt();
        for(int i = 0; i < size; i++)
        {
            System.out.println(" Enter a number to push into stack : ");
            int x = scan.nextInt();
            stack.push(x);
        }
    }

    // Popping elements
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println(" Pop :");

        for(int i = 0; i < size; i++)
        {
            Integer y = stack.pop();
            System.out.println(" " + y + " ");
        }
    }

    static void stack_display(Stack<Integer> stack)
    {
        System.out.println(" Elements inside stack : ");
        System.out.println(stack);
    }

    // Displaying elements
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = stack.peek();
        System.out.println(" Element on stack top : " + element);
    }

    // Searching elements
    static void stack_search(Stack<Integer> stack)
    {
        int element;
        System.out.println(" Enter the number you wish to search : ");
        element = scan.nextInt();

        Integer pos = stack.search(element);

        if(pos == -1)
            System.out.println(" Element not found ");
        else
            System.out.println(" Element is found at position " + pos);
    }

}