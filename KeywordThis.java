public class KeywordThis {
    int x = 10;   

    void display() {
        System.out.println("Value using this: " + this.x);
    }

    public static void main(String[] args) {
        KeywordThis obj = new KeywordThis();
        obj.display();
    }
}
