public class Q11_age_calculation {
        public static void main(String[] args) {
            int personAgeAt28 = 28;
            int youngerBrotherAgeAt28 = 24;
            int ageDifference = personAgeAt28 - youngerBrotherAgeAt28;
            int personAgeAt56 = 56 + ageDifference;


            if (ageDifference > 3) {
                int youngerBrotherAgeAt5 = youngerBrotherAgeAt28 - ageDifference + 5;
                System.out.println("The age of the younger brother when the older brother was 5: " + youngerBrotherAgeAt5);
            } else {
                System.out.println("The age of the person when the older brother is 56: " + personAgeAt56);
            }
        }
    }

