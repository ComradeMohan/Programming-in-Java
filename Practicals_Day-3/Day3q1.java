public class Day3q1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("oops! there is an exception " + e);
        }
        try{
            double d=Math.log(0);
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("yay! here is your exception "+e);
        }
        try{
            double g=Math.tan(Math.toRadians(90));
            System.out.println(g);
        }
        catch(Exception e){
            System.out.println("Error!! Exception found "+e);
        }
        try{
            double i=Math.pow(0,0);
            System.out.println(i);
        }
        catch(Exception e){
            System.out.println("Exception found!!! "+e);
        }
    }
}
