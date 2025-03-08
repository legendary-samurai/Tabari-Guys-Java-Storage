public class CastingChallenge {

        public static void main(String[] args) {

                byte byteValue = -64;
                short shortValue = 31000;
                int intValue = 254337;
                int sumOfThreeValue = (byteValue + shortValue + intValue);
                long longValue = 50_000L + (10 * sumOfThreeValue);
                System.out.println(longValue);

        }
}