class Parent {
    void even() {
        System.out.println("even numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void odd() {
        System.out.println("odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    void prime() {
        System.out.println("prime numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class child extends Parent{
    @Override
    void even(){
        System.out.println("even numbers from 1 to 30: ");
        for(int i=1;i<=30;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    @Override
    void odd(){
        System.out.println("odd numbers from 1 to 30: ");
        for(int i=1;i<=30;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    @Override
    void prime(){
        System.out.println("prime numbers in range 1 to 30: ");
        for(int i=1;i<=30;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
}
public class Methodss {
    public static void main(String[] args){
        child child=new child();
        child.even();
        System.out.println();
        child.odd();
        System.out.println();
        child.prime();
    }
}
