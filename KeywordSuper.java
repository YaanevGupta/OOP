class Parent {
    int x = 10;   
}

public class KeywordSuper extends Parent {

    void display() {
        System.out.println("Value using super: " + super.x);
    }

    public static void main(String[] args) {
        KeywordSuper obj = new KeywordSuper();
        obj.display();
    }
}
