import java.util.Scanner;

class InheritanceNonStatic {

    int n;   
    int m;          

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InheritanceNonStatic obj = new InheritanceNonStatic();   

        int x; 

        System.out.print("Enter value for local variable x: ");
        x = sc.nextInt();

        System.out.print("Enter value for instance variable n: ");
        obj.n = sc.nextInt();   

        System.out.print("Enter value for instance variable m: ");
        obj.m = sc.nextInt();    

        System.out.println("\n--- Results ---");
        System.out.println("Instance variable (obj.m): " + obj.m);
        System.out.println("Instance variable (obj.n): " + obj.n);
        System.out.println("Local variable (x): " + x);

        sc.close();
    }
}