class Parent {
    int x = 10;
}

public class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Using this: " + this.x);
        System.out.println("Using super: " + super.x);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
