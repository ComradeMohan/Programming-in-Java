interface calculator{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    double div(int a,int b);
}
class Basiccalculator implements calculator{
    @Override
    public int add(int a,int b){
    return a+b;
    }
    @Override
    public int sub(int a,int b) {
        return a-b;
    }
    @Override
    public int mul(int a,int b){
        return  a*b;
    }
    @Override
    public double div(int a, int b) {
        if(b==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        return (double)a/b;
    }
}
public class Day2q6 {
    public static void main(String[] args) {
        Basiccalculator c = new Basiccalculator();
        int sum = c.add(5, 3);
        int difference = c.sub(10, 4);
        int product = c.mul(6, 2);
        double quotient = c.div(15, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
