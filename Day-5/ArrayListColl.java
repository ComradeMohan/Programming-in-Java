import java.util.ArrayList;

public class ArrayListColl {
    public static void main(String[] args)
    {
        ArrayList<Integer> M=new ArrayList<Integer>();
        M.add(100);
        M.add(200);
        M.add(300);
        System.out.println(M);
        M.remove(2);
        System.out.println(M);
    }
}
