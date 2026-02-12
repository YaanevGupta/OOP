import java.util.Scanner;

public class DuplicateCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean duplicateFound = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound = true;
                    break; 
                }
            }
            if (duplicateFound) {
                break;
            }
        }

        if (duplicateFound) {
            System.out.println("Result: Duplicate element found.");
        } else {
            System.out.println("Result: No duplicate elements.");
        }
        
        sc.close(); 
    }
}