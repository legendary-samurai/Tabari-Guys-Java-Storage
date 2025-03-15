public class Example {

        public static void main(String[] args)
        {
		// This example includes from 0 to end of Switch case.
                String username = "achilles";
                String uuid = getUUID(username);
                int score = (int) calculateUserScore(uuid);
                char cScore = getCScore(score);
                printInformation(username, uuid, score, cScore);

        }

        // calculates user with uuid number
        public static double calculateUserScore(String uuid) {

                double score = 0;

                for (int i = 0; i < uuid.length(); i++) {
                        score += (int) uuid.charAt(i);
                }

                return score;
        }

        // Print user information.
        public static void printInformation(String username, String uuid, int score, char cScore) {

                String msg = String.format("USERNAME: %s\nUUID: %s\nSCORE: %d\nCHAR SCORE: %s",
                        username, uuid,
                        score, cScore);

                System.out.println(msg);
        }

        // get uuid from converting username alpha to their ascii code.
        public static String getUUID(String str) {

                StringBuilder encoded = new StringBuilder();

                for (int i = 0; i < str.length(); i++)
                        encoded.append((int)str.charAt(i));

                return encoded.toString();
        }

        // return CHAR SCORE base on first score number
        public static char getCScore(int score) {
                char cScore = String.valueOf(score).charAt(0);
                return switch (cScore) {
                        case '1' -> 'A';
                        case '2' -> 'B';
                        case '3' -> 'C';
                        case '4' -> 'D';
                        case '5' -> 'E';
                        case '6' -> 'F';
                        case '7' -> 'G';
                        case '8' -> 'H';
                        case '9' -> 'I';
                        default -> { yield '0'; }
                };
        }

}
