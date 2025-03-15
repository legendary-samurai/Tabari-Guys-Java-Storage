public class LocalVariable {

        public static void main(String[] args) {

                int value = 2;

                switch (value) {

                        case 0:
                                // System.out.println(i); // This isn't ok.
                                break;

                        case 1:
                                int i = 2;
                                System.out.println(i);
                                break;

                        case 2:
                                i = 5; // it's ok. but if we use enhanced switch it doesn't work.
                                System.out.println(i);
                                break;

                        default:
                                System.out.println(value);
                                break;
                }

        }
}
