class ConstructorN {
    int a=1;
    int b=7;
    ConstructorN()
    {

    }
    ConstructorN(int a , int b)
    {
        a=5;
        a=10;
    }
    void add(int a , int b )
    {
        int c = a + b;
        System.out.println("Sum : " +c);
    }
//    public static void main(String[] args)
//    {
//        int a=7,b=3;
//        ConstructorN C=new ConstructorN(6,9);
//        C.add(10,9);
//    }
}
