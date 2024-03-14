interface summable{
    int sum(int[] numbers);
    }
interface averagable{
    double avg(int[] numbers);
}
interface percentagecalculable{
    double percentage(double obtained,double total);
}
class Calculation implements summable,averagable,percentagecalculable{
    @Override
    public int sum(int[] numbers){
        int total=0;
        for(int num: numbers){
            total+=num;
        }
        return total;
    }
    @Override
    public double avg(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }
    @Override
    public double percentage(double obtained, double total) {
        return (obtained / total) * 100.0;
    }
}
public class Day2q7 {
    public static void main(String[] args) {
        int[] numbers = {80, 75, 90, 85, 95};
        Calculation calculation = new Calculation();
        int sum = calculation.sum(numbers);
        double avg = calculation.avg(numbers);
        double percentage = calculation.percentage(350, 500);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}
