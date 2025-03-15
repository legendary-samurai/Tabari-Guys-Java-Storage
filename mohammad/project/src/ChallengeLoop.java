public class ChallengeLoop {

        public static void main(String[] args) {

                System.out.println("With while loop");
                int finishNumber = 20;
                int number = 5;
                int totalEvenNumbers = 0;
                int evenMatch = 0;

                while (number <= finishNumber && evenMatch != 5) {

                        // if we want to print only odd number, we would to add ! first of condition:
                        //      (!isEvenNumber(number))
                        if (isEvenNumber(number)) {
                                System.out.println(number);
                                totalEvenNumbers += number;
                                evenMatch++;
                        }
                        number++;
                }

                System.out.println("Total even numbers: " + totalEvenNumbers);
                System.out.println("\nWith do-while loop");


                number = 5;
                totalEvenNumbers = 0;
                evenMatch = 0;

                do {

                        if (isEvenNumber(number)) {
                                System.out.println(number);
                                totalEvenNumbers += number;
                                evenMatch++;
                        }
                        number++;

                } while (number <= finishNumber && evenMatch != 5);

                System.out.println("Total even numbers: " + totalEvenNumbers);

        }

        public static boolean isEvenNumber(int number) {
                return number % 2 == 0;
        }
}
