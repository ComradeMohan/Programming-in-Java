import java.util.LinkedList;
import java.util.List;
public class LinkedListColl {
    public static void main(String[] args)
    {
        List<String> L=new LinkedList<String>();
        L.add("ABC");
        L.add("DEFG");
        L.add("HIJ");
        System.out.println(L);
        L.remove("ABC");
        System.out.print(L);
    }
}
