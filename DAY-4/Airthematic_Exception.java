import java.util.Scanner;

public class Airthematic_Exception {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        try
        {
            System.out.println("Enter two numbers :");
            int a =in.nextInt();
            int b =in.nextInt();
            int  c=a/b;
            System.out.print(c);
        }
        catch (Exception e)
        {
            System.out.print("There is exception :\n" +e);
        }
    }
}
