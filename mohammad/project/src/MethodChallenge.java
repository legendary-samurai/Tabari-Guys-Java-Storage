public class MethodChallenge {

        public static void main(String[] args) {

                int highScorePosition = calculateHighScorePosition(1500);
                displayHighScorePosition("Mohammad", highScorePosition);

                highScorePosition = calculateHighScorePosition(1000);
                displayHighScorePosition("Alireza", highScorePosition);

                highScorePosition = calculateHighScorePosition(500);
                displayHighScorePosition("Nima", highScorePosition);

                highScorePosition = calculateHighScorePosition(100);
                displayHighScorePosition("Reza", highScorePosition);

                highScorePosition = calculateHighScorePosition(25);
                displayHighScorePosition("Ali", highScorePosition);
        }

        public static int calculateHighScorePosition(int playerScore) {

                if (playerScore >= 1000) {
                        return 1;
                } else if (playerScore >= 500) {
                        return 2;
                } else if (playerScore >= 100) {
                        return 3;
                }

                return 4;
        }

        public static void displayHighScorePosition(String playerName, int playerPosition) {

                String message = String.format("%s managed to get into position %d on the high score list.",
                        playerName, playerPosition);
                System.out.println(message);
        }
}
