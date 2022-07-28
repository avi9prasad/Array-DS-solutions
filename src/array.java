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








