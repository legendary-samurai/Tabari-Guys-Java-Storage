public class LoopSecondChallenge {

        public static void main(String[] args) {

                int number = 0;
                int result = sumDigits(number);
                System.out.println(result);

        }

        public static int sumDigits(int number) {

                if (number < 0) {
                        return -1;
                }

                /*
                First method
                // in this method we will convert number to string and iterate over it
                // its character will convert to int again to sum.

                String str_num = String.valueOf(number);
                int sum = 0;

                for (int i = 0; i < str_num.length(); i++) {
                        sum += str_num.charAt(i) - '0';
                }

                 */

                // Second method
                int sum = 0;
                // int i = 0;

                // when number mod 10, it will give you right side digit.
                // with number /= 10, the right digit will remove from your number.
                while (number > 0) {

                        sum += number % 10;
                        number /= 10;
                }

                return sum;

        }
}
