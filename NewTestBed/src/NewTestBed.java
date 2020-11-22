import java.util.Scanner;

public class NewTestBed {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number for the size of your array: ");
        int arraySz = scan.nextInt();
        int[] array1 = new int[arraySz];
        int[] array2 = new int[arraySz];

        int x = (int)(Math.random()*30) + 1;
        int y = (int)(Math.random()*30) + 1;
        System.out.printf("%d * %d = %d\n", x, y , mult(x, y));

        for(int i = 0; i < array1.length;i++ ){
            int xRand = (int)(Math.random()*30) + 1;
            int yRand = (int)(Math.random()*30) + 1;
            array1[i] = xRand;
            array2[i] = yRand;

        }

        System.out.print("Array 1: ");
        for(int e : array1){
            System.out.printf( "%5d ", e);
        }
        System.out.print("\nArray 2: ");
        for(int e : array2){
            System.out.printf( "%5d ", e);
        }

        System.out.print("\nProduct: ");
        for(int e : multArray(array1, array2))
            System.out.printf("%5d ", e);

    }
    public static int mult(int num1 , int num2){
        return num1 *num2;
    }
    public static int[] multArray(int[] a1, int[] a2){
        int[] product = new int[a1.length];
        for(int k = 0; k < a1.length; k++){
            product[k] = a1[k] * a2[k];
        }
        return product;
    }

}
