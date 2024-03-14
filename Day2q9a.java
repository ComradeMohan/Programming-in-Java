class MyClass {
    static int count = 0;
    MyClass() {
        count++;
    }
    void displayCount() {
        System.out.println("Number of instances created: " + count);
    }
}
public class Day2q9a {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.displayCount();
        MyClass obj2 = new MyClass();
        obj2.displayCount();
    }
}

