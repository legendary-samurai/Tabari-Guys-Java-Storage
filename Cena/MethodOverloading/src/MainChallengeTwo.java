/*
* we're going to create a method , that takes time , represented in seconds , as the parameter
* we'll then want to transform the seconds into hours
* next , you'll display the time in hours with the remaining minutes and seconds in a String
* we'll do this transformation in two steps , which allows us to use overloaded methods
*
* 1 : we want to create two methods with the same name "getDurationString"
* 2 : the first method has one parameter of type int , named seconds
* 3 : the second method has two parameters , named minutes and seconds , both int
*
*
* role : both methods return a String in the format shown:
*        'XXh YYm ZZs'
*        xx represent the number of hours
*        yy the number of minutes
*        zz number of seconds
*
*        the first method should in turn call the second method to return its results
*
* tip :
*      1hour = 60min
*      1hour = 3600sec
*      1min = 60sec
*
* challenge bonus :
*      add validation to the methods as a bounds :
*             for the first method , the seconds parameter should be >= 0
*             for the sec method , the minutes parameter should be >= 0 , and the seconds parameter should >= 0 , and <= 59
*             if either method is passed an invalid value , print out some type of meaningful message to user
*
*/

public class MainChallengeTwo {

    public static void main(String[] args) {
        System.out.println(getDurationString(4500));
    }

    public static String getDurationString(int seconds){
        int hourCount = 0;
        int minCount = 0;
        int secCount = 0;
        // check if the seconds parameter is more then or equal 0
        if (seconds >= 0){
            // calc to hour
            

        // else return an error
        }else {
            return "Error : the seconds must be more then or equal 0";
        }

        return (00 + "h" + " " + 00 + "m" + " "  + 00 + "s");
    }

    public static String getDurationString(int minutes , int seconds){
        return (00 + "h" + " " + 00 + "m" + " "  + 00 + "s");
    }

    public static void showResult(int result){
        System.out.println(result);
    }
    public static void showResult(int resultOne , int resultTwo){
        System.out.println(resultOne + " " + resultTwo);
    }
}
