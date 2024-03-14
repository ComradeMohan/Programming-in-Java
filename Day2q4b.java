public class Day2q4b {
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        Day2q4b m=new Day2q4b();
        System.out.println("Sum of 2 and 3: " + m.sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + m.sum(2.5, 3.5));
    }
}
