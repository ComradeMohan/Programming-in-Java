class OuterClass {
    static int outerNum = 10;
    static class StaticNestedClass {
        void display() {
            System.out.println("outerNum from OuterClass: " + outerNum);
        }
    }
}

public class Day2q9d {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }

}
