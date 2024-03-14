class MyClas{
    static int num;
    // This is a static block
    static {
        num = 10;
        System.out.println("Static block executed. num: " + num);
    }
}
public class Day2q9c {
    public static void main(String[] args) {
        // The static block will be executed when the MyClass class is loaded
        MyClas obj = new MyClas();
    }
}
