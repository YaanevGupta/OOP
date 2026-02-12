 class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

    public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(590012444, "YaanevGupta");
        
        s1.display();
    }
}