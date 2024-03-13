import java.util.Random;
public class stringbuilder_and_buffer {
    public static void main(String[] args) {
        int iterations = 100000;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            int randomIndex = random.nextInt(alphabet.length());
            sb.append(alphabet.charAt(randomIndex));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " milliseconds");


        startTime = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            int randomIndex = random.nextInt(alphabet.length());
            sbuf.append(alphabet.charAt(randomIndex));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " milliseconds");
}
}