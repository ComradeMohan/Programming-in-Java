public class NullPointerExe {
    public static void main(String[] args) {
        try {
            String str = null; // Assigning null value
            System.out.println(str.length()); // Trying to compute length of null
        } catch (NullPointerException e) {
            System.out.println("Exception \n"+e);
        }
    }
}
