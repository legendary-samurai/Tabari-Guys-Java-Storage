public class MethodOverloadSecondChallenge {

        public static void main(String[] args) {

                // Always think first about program implementation, then write code to follow DRY rule.
                String test1 = getDurationString(3945);
                String test2 = getDurationString(-65, 45);
                String time3 = getDurationString(65, 145);

                System.out.println(test1);
                System.out.println(test2);
                System.out.println(time3);

        }

        // Learner method
        public static String getDurationString(int seconds) {

                if (seconds < 0) {
                        return "Invalid data for seconds(" + seconds + "), must be positive integer value";
                }

                return getDurationString(seconds / 60, seconds % 60);
        }

        public static String getDurationString(int minutes, int seconds) {

                if (minutes < 0) {
                        return "Invalid data for seconds(" + minutes + "), must be positive integer value";
                }

                if (seconds < 0 || seconds > 59) {
                        return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
                }

                int hour = minutes / 60;
                int remainingMinutes = minutes % 60;

                return hour + "h " + seconds + "m " + remainingMinutes + "s";
        }


        // My method
        /* public static String getDurationString(int seconds) {

                if (seconds < 0) {
                        return "second must be between 0 and 59";
                }

                // this method will return string with "XXh XXm XXs" format.
                int second = seconds % 60;
                int minute = seconds / 60 % 60;
                int hour = seconds / 3600;

                return String.format("%dh %dm %ds", hour, minute, second);
        }

        public static String getDurationString(int minutes, int seconds) {

                // this method will return string with "XXh XXm XXs" format.
                if (minutes < 0) {
                        return "minute must be positive";
                }

                if (seconds < 0 || seconds > 59) {
                        return "second must be between 0 and 59";
                }

                int hour = minutes / 60;
                int second = seconds % 60;
                int minute = minutes % 60;

                return String.format("%dh %dm %ds", hour, minute, second);
       } */

}
