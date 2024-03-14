public class Day2q4 {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a){
        return a;
    }
    public static void main(String[] args){
        Day2q4 main=new Day2q4();
        System.out.println("Sum of 2 and 3: " + main.sum(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + main.sum(2, 3, 4));
        System.out.println("Sum of 2: " + main.sum(2));
    }
}
