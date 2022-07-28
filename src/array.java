import javax.lang.model.util.ElementScanner6;
import java.util.Arrays;
import java.util.Scanner;

/*public class array {

    public static void main(String[] args) {

        int[][] a = {{10, 20, 30, 40}, {70, 80, 90}};
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "");

            }

            System.out.println();


        }
    }
}
*/
// 3d array //
/*
class array
{
    public static void main(String []args)

    {
        int [] [] []a = {{{10,20,30},{40,50,60},{100,450,2}}};

            for(int i = 0;i<a.length;i++) {
                for (int j = 0; j < a[i].length; j++) {
                    for (int k = 0; k < a[i][j].length; k++) {
                        System.out.print(a[i][j][k] + " ");
                    }
                    System.out.println();
                }
            }
    }

}
/*

 */
/* */
/*

 */

/*
class array
{
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numer you want to short");
        n = sc.nextInt();
        String names[] = new String[n];
        Scanner sc1=new Scanner (System.in);
        System.out.println(" enter all the names you want to short");
        for(int i=0;i<n;i++)
        {
            names[i]=sc1.nextLine();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
                if (names[i].compareTo(names[j])>0){
                    temp=names[1];
                    names[i]=names[j];
                    names[j=temp;]
                }

    }
}
*/
// reverse an array//
/*

class array {
    public static void main(String[] args) {
        int []arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        {
            System.out.println("Orginal array");
        }
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println();
            }

        {
            System.out.println("revere array list");
        }
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + "");
        }
    }
}
*/
// maximun and minimum element in array//

 /* class searchMax
{
    public static void main(String[] args) {
        int[] a ={4,3,5,2,1,6};
        int max=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("maximun element is " +max);
    }
}

  */
// find the kth max and min in an array //

 class kthLargstElement {
     public static void main(String[] args) {
         int a[] = {10, 24, 61, 87, 3};
         int k = 3;
         for (int i = 0; i < a.length - 1; i++) {
             for (int j = i + 1; j < a.length; j++) {
                 if (a[i] < a[j]) {
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;

                 }
             }
             if (i == k - 1) {
                 System.out.println(k + "largest element is " + a[i]);
             }
         }
         System.out.println("................");
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i] + " ");
         }
     }
 }














