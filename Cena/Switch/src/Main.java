public class Main {
    public static void main(String[] args){
        int count = 10;
        switch (count){
            case 1 : {
                showResult("case is 1");
                break;
            }
            case 2 : {
                showResult("case is 2");
            }
            default:{
                showResult("not found !");
            }
        }
    }

    public static void showResult(String text){
        System.out.println(text);
    }
}
