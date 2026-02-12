import java.util.Scanner;

public class ArraySum {
    int sum = 0;
    int[] arr;

    ArraySum(int s) {
        arr = new int[s];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = s.nextInt();

        ArraySum as = new ArraySum(size);

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            as.arr[i] = s.nextInt();
            as.sum += as.arr[i];
        }

        System.out.println("Sum of array elements: " + as.sum);
        s.close();
    }
}