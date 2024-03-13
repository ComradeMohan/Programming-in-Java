public class Q12_persons_birth_year {
        public static void main(String[] args) {
            int currentYear = 2073;
            int eligibilityAge = 21;
            int voteEligibleYear = currentYear - eligibilityAge;
            if (voteEligibleYear > 2060) {
                System.out.println("Birth year is more than 2060.");
                System.out.println("Years between vote-eligible year and 2023:");
                for (int year = voteEligibleYear; year >= 2023; year--) {
                    System.out.println(year);
                }
            } else {
                int birthYear = currentYear - eligibilityAge;
                System.out.println("Birth year: " + birthYear);
            }
        }
    }

