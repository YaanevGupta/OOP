import java.util.Scanner;

class InheritanceStatic {

    static int n;   
    int m;          

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InheritanceStatic obj = new InheritanceStatic();   

        int x;   

        System.out.print("Enter value for local variable x: ");
        x = sc.nextInt();

        System.out.print("Enter value for static variable n: ");
        InheritanceStatic.n = sc.nextInt();   

        System.out.print("Enter value for instance variable m: ");
        obj.m = sc.nextInt();    

        System.out.println("Instance variable (obj.m): " + obj.m);
        System.out.println("Local variable (x): " + x);
        System.out.println("Static variable (InheritanceStatic.n): " + InheritanceStatic55.n);

        sc.close();
    }
}