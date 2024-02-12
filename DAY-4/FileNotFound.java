import java.io.File;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            File f = new File("test.txt");
            FileReader fr=new FileReader(f);
            }
        catch (Exception e) {
            System.out.println("Exception\n"+e);

        }
    }
}
