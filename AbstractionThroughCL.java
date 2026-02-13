abstract class A {
    abstract int compare(String s1, String s2);
}

class B extends A {
    @Override
    int compare(String s1, String s2) {
        if (s1.equals(s2)) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class AbstractionThroughCL {
    public static void main(String[] args) {
        String string1 = "OOP";
        String string2 = "OOP";

        B b = new B();
        int x = b.compare(string1, string2);
        System.out.println(x);
    }
}