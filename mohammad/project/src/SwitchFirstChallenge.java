import java.util.Scanner;

public class SwitchFirstChallenge {

        public static void main(String[] args) {

                char c = 'A';

                // Traditional switch that supports in all version of jdk
                switch (c) {
                        case 'A':
                                System.out.println("A -> Able");
                                break;
                        case 'B':
                                System.out.println("B -> Baker");
                                break;
                        case 'C':
                                System.out.println("C -> Charlie");
                                break;
                        case 'D':
                                System.out.println("D -> Dog");
                                break;
                        case 'E':
                                System.out.println("E -> Easy");
                                break;
                        default:
                                System.out.println("Not found character");
                                break;
                }

                int day = 4;
                String dayOfWeek = printDayOfWeek(day);
                System.out.println(day + " stand for " + dayOfWeek);
        }

        public static String printDayOfWeek(int day) {
                // Enhanced switch supports in <= jdk 14
                // We can use both method.
                 return switch (day) {
                        case 0 -> "Sunday";
                        case 1 -> "Monday";
                        case 2 -> "Tuesday";

                        case 3 -> {
                                yield "Wednesday";
                        }
                        case 4 -> {
                                yield "Thursday";
                        }
                        case 5 -> {
                                yield "Friday";
                        }
                        case 6 -> {
                                yield "Saturday";
                        }
                        default -> "Out of day";
                };
        }
}
