public class PriorityChallenge {

        public static void main(String[] args) {

                double var1 = 20.00d;
                double var2 = 80.00d;

                double operation = (var1 + var2  * 100.00d) % 40.00d;

                boolean isZero = (operation == 0) ? true : false;
                // it's better to declare isZero like above.
                // boolean isZero = (operation == 0);

                System.out.println(isZero);

        }
}
