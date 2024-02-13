import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetColl {
    public static void main(String[] args)
    {
        SortedSet<String> M = new TreeSet<String>();
        M.add("Mohan");
        M.add("192210400");
        M.add("Saveetha");
        System.out.println(M);
        M.remove("192210400");
        System.out.println(M);

        SortedSet<Integer> L = new TreeSet<Integer>();
        L.add(100);
        L.add(786);
        L.add(988);
        System.out.println(L);
        L.remove(100);
        System.out.println(L);

    }
}
