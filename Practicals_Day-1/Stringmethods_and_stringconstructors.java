public class Stringmethods_and_stringconstructors {

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str2 = new String(charArray);
        String str3 = new String("String Constructor");

        System.out.println("String Constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("\nString Methods:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));
        System.out.println("Substring of str1 from index 7 to the end: " + str1.substring(7));
        String concatStr = str1.concat(" This is a concatenation.");
        System.out.println("Concatenated string: " + concatStr);

        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));

        String compareStr = "Hello, World!";
        System.out.println("str1 equals compareStr: " + true);

        System.out.println("Uppercase of str1: " + str1.toUpperCase());
        System.out.println("Lowercase of str1: " + str1.toLowerCase());

        String spacedStr = "   Trim this string   ";
        System.out.println("Trimmed version of spacedStr: '" + spacedStr.trim() + "'");
        String replacedStr = str1.replace('o', 'X');
        System.out.println("String after replacing 'o' with 'X': " + replacedStr);
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
 }
}
}