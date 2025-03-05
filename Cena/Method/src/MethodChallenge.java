public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim" , 1500);
        displayHighScorePosition("Cena" , 1000);
        displayHighScorePosition("NerdUser" , 500);
        displayHighScorePosition("Jason" , 100);
        displayHighScorePosition("Sara" , 25);
    }

    public static void displayHighScorePosition(String playerName , int playerPosition){
        int playerScore = calculateHighScorePosition(playerPosition);
        System.out.println(playerName + " managed to get into position " + playerScore + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            return position;

        }else if (playerScore >= 500){
            return position;

        }else if (playerScore >= 100){
            return position;

        }
        return position;
    }
}
