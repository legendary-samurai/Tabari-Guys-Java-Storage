public class Loops {

        public static void main(String[] args) {


                System.out.println("For loop:");
                for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                }

                System.out.println("\nWhile loop:");
                int counter = 0;
                boolean isReady = true;

                while (isReady) {

                        if (counter > 5) {
                                isReady = false;
                        }
                        System.out.println(counter++);
                }


                // PAY ATTENTION --- Look the implementation of do wait
                System.out.println("\nDo while loop:");
                int counter2 = 0;
                boolean isReady2 = true;

                // first print counter then check counter value to break loop condition.
                do {
                        System.out.println(counter2++);
                        if (counter2 > 5) {
                                isReady2 = false;
                        }

                } while (isReady2);

                System.out.println("\nDo while loop 2:");
                int counter3 = 0;
                boolean isReady3;

                // isReady initialized in do block and print counter, then check counter value to break loop condition
                do {
                        isReady3 = true;

                        System.out.println(counter3++);
                        if (counter3 > 5) {
                                isReady3 = false;
                        }

                } while (isReady3);

                System.out.println("\nwhile loop 3:");

                // more example.
                int number = 0;
                while (number < 50) {

                        number += 5;
                        if (number % 25 == 0) {
                                continue;
                        }
                        System.out.println(number);
                }

                // do above example with do-while
                System.out.println("\nDo while loop 4:");

                int number2 = 0;
                do {
                        number2 += 5;
                        if (number2 % 25 == 0) {
                                continue;
                        }
                        System.out.println(number2);

                } while (number2 < 50);
        }
}
