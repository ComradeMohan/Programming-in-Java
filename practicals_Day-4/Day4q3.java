import java.util.EnumMap;
enum Sport {
    HANDBALL,FOOTBALL, BASKETBALL, TENNIS, VOLLEYBALL, CRICKET
}
public class Day4q3{
    public static void main(String[] args) {
        EnumMap<Sport, String> BAT = new EnumMap<>(Sport.class);
        BAT.put(Sport.FOOTBALL, "Soccer ball");
        BAT.put(Sport.BASKETBALL, "Basketball");
        BAT.put(Sport.TENNIS, "Tennis racket");
        BAT.put(Sport.VOLLEYBALL, "Volleyball");
        BAT.put(Sport.CRICKET, "Cricket bat");
        System.out.println("Is 'Handball' present in BAT enum map? " + BAT.containsKey(Sport.HANDBALL));
        if (!BAT.containsKey(Sport.HANDBALL)) {
            BAT.clear();
        }
        System.out.println("Enum map after clearing if 'Handball' not present: " + BAT);
        EnumMap<Sport, String> clonedBAT = BAT.clone();
        System.out.println("Cloned Enum map: " + clonedBAT);
        System.out.println("Original Enum map: " + BAT);
        Sport key = Sport.BASKETBALL;
        if (BAT.containsKey(key)) {
            System.out.println("The enum map contains a mapping for key '" + key + "'");
        } else {
            System.out.println("The enum map does not contain a mapping for key '" + key + "'");
            // Replace the value with enum map "TRIO" values
            for (Sport sport : Sport.values()) {
                BAT.put(sport, "TRIO");
            }
            System.out.println("Enum map after replacing values: " + BAT);
        }
        int primeCount = 0;
        for (EnumMap.Entry<Sport, String> entry : BAT.entrySet()) {
            String value = entry.getValue();
            if (isPrime(value.length())) {
                primeCount++;
            }
        }
        System.out.println("Number of prime key-value pairs: " + primeCount);
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
