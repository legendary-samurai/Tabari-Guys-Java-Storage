public class SwitchCase {

        public static void main(String[] args) {

                int rank = 4;

                // Enhanced Switch case
                // It is clean.
                switch (rank) {
                        case 1 ->       System.out.println("A");
                        case 2 ->       System.out.println("B");
                        case 3, 4, 5 -> System.out.println("C");
                        default ->      System.out.println("D");
                }

                // Traditional switch case
                switch (rank) {
                        case 1:
                                System.out.println("A");
                                break;
                        case 2:
                                System.out.println("B");
                                break;
                        case 3: case 4: case 5:
                                System.out.println("C");
                                break;
                        default:
                                System.out.println("D");
                                break;
                }

                System.out.println(getQuarter("Nov"));
        }

        public static String getQuarter(String month) {

                // when use switch like this case you have to declare 'default' section.
                return switch (month) {
                        case "Jan", "Feb", "Mar"  -> "1st";
                        case "Apr", "May", "Jun"  -> "2nd";
                        case "July", "Aug", "Sep" -> "3rd";
                        case "Oct", "Nov", "Dec"  -> "4th";
                        default                   -> "Bad!";
                };

                // When to use yield in switch ?
                // When your case block uses curly brace
                // NOTE: You cannot use 'yield' keyword in case block without curly brace.
                // " default -> "1st"; " translate to  " default -> { yield "1st"; } "

        }
}
