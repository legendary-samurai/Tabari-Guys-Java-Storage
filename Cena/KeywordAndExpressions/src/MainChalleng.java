public class MainChalleng {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calcScore(gameOver , score , levelCompleted , bonus);
    }

    public static void calcScore(boolean gameOver , int score , int levelCompleted , int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was : " + finalScore);
        }
    }
}
