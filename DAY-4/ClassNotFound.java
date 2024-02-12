public class ClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("mohan");
        } catch (ClassNotFoundException e) {
            System.out.println("An error occurred.\n"+e);
        }
    }
}
