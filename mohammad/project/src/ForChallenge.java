public class ForChallenge {

        public static void main(String[] args) {

                int MAX = 1000;

                int countOfMatch = 0;
                int sumOfMatch = 0;

                for (int currentNumber = 1; countOfMatch != 5 && currentNumber < MAX; currentNumber++) {

                        if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                                countOfMatch++;
                                sumOfMatch += currentNumber;
                                System.out.println("Found match in " + currentNumber);
                        }
                }

                System.out.println("\nCount of match: " + countOfMatch);
                System.out.println("Sum of match: " + sumOfMatch);
        }
}
