//1 : create two method with the same name "convertToCentimeters"
//2 : first method => one parameter of type int , height in inches , convert it to centimeters , return double
//3 : sec method => two parameters int , one height feet and one height in inches (this method will convert feet and inches to just inches , then call the first method , to get the number of centimeters ) , return double
//tip : both methods should return a real number or decimal value for total height in centimeters
//      call both methods , and print out the results

//formula :
//          inches to centimeters = 1inch : 2.54cm
//          foot to inches = 1foot : 12inch
public class MainChallenge {

    public static void main(String[] args) {
        showResult(convertToCentimeters(54) , "54 inch to centimeters : ");
        showResult(convertToCentimeters(84 , 6) , "86 inch and 6 feet to centimeters : ");
    }

    public static double convertToCentimeters(int inch){
        return (double) (inch * 2.54);
    }
    public static double convertToCentimeters(int inch , int feet){
        return (double) convertToCentimeters((feet * 12) + inch);
    }

    public static void showResult(int result){
        System.out.println(result);
    }
    public static void showResult(double result){
        System.out.println(result);
    }
    public static void showResult(String result){
        System.out.println(result);
    }
    public static void showResult(double result , String resultText){
        System.out.println(resultText + " : " + result);
    }
}
