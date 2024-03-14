class Paren {
    final void display() {
        System.out.println("Hello from Parent!");
    }
}
class Child extends Paren {
    void sayHello() {
        System.out.println("Hello from Child!");
    }
}
public class Day2q10b{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.sayHello();
    }
}