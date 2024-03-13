public class Q19_Or_and_And_gate {
        public static boolean OR(boolean input1,boolean input2){
            return input1||input2;
        }
        public static boolean AND(boolean input1,boolean input2){
            return input1 && input2;
        }
        public static void main(String[] args)
        {
            boolean input1=true;
            boolean input2=false;
            System.out.println("OR gate:");
            System.out.println(input1+"OR"+input2+"="+OR(input1,input2));
            input1=true;
            input2=false;
            System.out.println("\nAND gate:");
            System.out.println(input1+"AND"+input2+"="+AND(input1,input2));
        }
    }

