public class MethodOverloadFirstChallenge {

        public static void main(String[] args) {

                System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
                System.out.println("68in = " + convertToCentimeters(68) + "cm");

        }

        public static double convertToCentimeters(int inches) {
                double inchBase = 2.54;
                return inches * inchBase;
        }

        public static double convertToCentimeters(int feet, int inches) {

                // Don't implement in one line !!!!!!
                // because it doesn't readable for other developer.
                // return convertToCentimeters((feet * 12) + inches);
                int feetToInches = (feet * 12);
                int totalInches =  + feetToInches + inches;
                return convertToCentimeters(totalInches);
        }
}
