public class String_W {
    public static void main(String args[])
    {
//        s.toUpperCase();
        String s="My name is Mike";
        String c=s.toUpperCase();
        System.out.println(" Upper case : "+c);
//        compareToIgnoreCase
        int compare=s.compareToIgnoreCase(c);
        System.out.println("Comparing : "+compare);


//        toLowerCase
        c=s.toLowerCase();
        System.out.println(" Lower case : "+c);
//        replace
        c=s.replace('i','j');
        System.out.println(" Replace 'i' with 'j' :"+c);
//        concat
        c=s.concat(". ");
        System.out.println(" Concat '.' :"+c);
//        substring
        c=s.substring(3,6);
        System.out.println(" Substring (3,6) '.' :"+c);
//        charAt
        char l=s.charAt(6);
        System.out.println(" char at '6':"+l);

    }
}
