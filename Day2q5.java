import java.util.Arrays;
abstract class abstractmath{
    abstract int total(int [] numbers);
    abstract double average(int [] numbers);
    double mean(int[] numbers){
        return total(numbers)/(double)numbers.length;
    }
    int mode(int [] numbers){
        return numbers[0];
    }
    double median(int[] numbers){
        Arrays.sort(numbers);
        int n= numbers.length;
        if(n%2==0){
            return(numbers[n/2-1]+numbers[n/2])/2.0;
        }else{
            return numbers[n/2];
        }
    }
}
class Mathoperations extends abstractmath{
    int total(int[] numbers){
        int sum=0;
        for(int num:  numbers){
            sum+=num;
        }
        return sum;
    }
    double average(int[] numbers){
        return total(numbers)/(double) numbers.length;
    }
}
public class Day2q5 {
    public static void main(String[] args){
        int[] numbers={3,7,2,5,8};
        Mathoperations m=new Mathoperations();
        System.out.println("Total: " + m.total(numbers));
        System.out.println("Average: " + m.average(numbers));
        System.out.println("Mean: " + m.mean(numbers));
        System.out.println("Mode: " + m.mode(numbers));
        System.out.println("Median: " + m.median(numbers));
    }
}
