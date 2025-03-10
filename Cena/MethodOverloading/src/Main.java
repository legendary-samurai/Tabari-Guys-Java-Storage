public class Main {
    public static void main(String[] args) {

    }

    public static int calculateScore(String playerName , int score){
        System.out.println("player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println(" scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("no player score");
        return 0;
    }
}
