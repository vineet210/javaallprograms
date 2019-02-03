import java.util.Scanner;

public class Array5 
{
    static Scanner scan = new Scanner(System.in);

    static void mergearrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3)
        {
            int i = 0, j = 0, k = 0;

            while (i<n1 && j <n2)
            {
                if (arr1[i] < arr2[j])
                    arr3[k++] = arr1[i++];
                else
                    arr3[k++] = arr2[j++];
            }

            while (i < n1)
                arr3[k++] = arr1[i++];

            while (j < n2)
                arr3[k++] = arr2[j++];
        }

    public static void main(String args[])
    {
        System.out.println(" Enter the size of first array : ");
        int i= scan.nextInt();
        int x[] = new int[i];
        for (int k=0; k<i; k++)
        {
            System.out.println(" Enter the " + k + " element of array : ");
            x[k]=scan.nextInt();
        }

        System.out.println(" Enter the size of second array : ");
        int j = scan.nextInt();
        int y[] = new int[j];
        for (int l=0; l<j; l++)
        {
            System.out.println(" Enter the " + l + " element of array : ");
            x[l]=scan.nextInt();
        }
        int z[]= new int[i+j];

        mergearrays(x,y,i,j,z);

        for(int k=0; k<i+j; k++)
            System.out.println(z[i] + " ");
    }
}