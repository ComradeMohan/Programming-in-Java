class base{
    void area(int a ,int b){
        int squareArea = a*a;
        System.out.println("area of sqquare: "+squareArea);
    }
}
class derived extends base{
    @Override
    void area(int a ,int b){
        int rectangle = a*b;
        System.out.println("Area of rectangle: "+rectangle);
    }
}
public class Day2q3 {
    public static void main(String[] args){
        base b=new base();
        b.area(4,5);
        derived d=new derived();
        d.area(4,5);
    }
}
