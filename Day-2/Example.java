public class Example extends ConstructorN{
    void add( String name , int a,int b)
    {
        int c= a+b;
        System.out.println("Name= "+name+" Marks ="+c);
    }
    void add(double a , double b)
    {
        double c=a+b;
        System.out.println("Example Sum : "+c );
    }
    public static void main(String[] args)
    {
        Example S=new Example();
        S.add(100,20);
        S.add(1.4,2.8);
        S.add("Mohan",50,49);
    }
}
