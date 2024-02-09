public class Student implements Mark_details, Hall_Ticket{
    double tot=0.0;
    @Override
    public String instructions() {
        return null;
    }

    @Override
    public int day(int d) {
        return d;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public double percentage(int total_M, int score) {
        double per=(score/total_M)*100 ;
        return per;

    }
    @Override
    public int marks(int a ,int b ,int c)
    {
        tot=a+b+c;
        return (int)tot;
    }
    public static void main(String[] args)
    {
        Student S=new Student();
        String name=S.name("Mohan");
        int total=S.marks(70,80,90);
        double per=S.percentage(300,total);
        System.out.println("Name = "+name+" Total marks = "+total+ " Percentage = "+per);
    }


}
