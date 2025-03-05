public class ChallengV39 {
    public static void main(String[] args){
        double doubleOne = 20.00D;
        double doubleTwo = 80.00D;
        double myValuesTotal = (doubleOne + doubleTwo) * 100D;
        System.out.println("my value total is : " + myValuesTotal);
        double theReminder = myValuesTotal % 40.00D;
        System.out.println("the Remainder = " + theReminder);
        boolean isNoRemainder = (theReminder == 0) ? true : false;
        System.out.println("is no remainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}
