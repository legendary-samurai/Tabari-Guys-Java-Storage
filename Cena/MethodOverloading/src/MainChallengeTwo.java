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
        showResult(getDurationString(3700));
        showResult(getDurationString(65 , 45));
    }


    // sec to hour
    public static String getDurationString(int seconds){
            int minutes ;
        // check if the seconds parameter is more then or equal 0
        if (seconds >= 0){
            minutes = seconds / 60;

        return getDurationString(minutes , seconds);
        // else return an error
        }else if(seconds < 0){
            return "Error : the seconds must be more then or equal 0";
        }else{
            return "Error : the parameters is invalid";
        }
    }


    // min and sec
    public static String getDurationString(int minutes , int seconds){
        int hours , remainingMinutes , remainingSec ;

        if(minutes >= 0 && (seconds >=0 && seconds <= 59)){
            hours = seconds / 60;
            remainingMinutes = minutes % 60;
            remainingSec = seconds % 60;

        // else return an error
        }else if(seconds < 0){
            return "Error : the seconds must be more then or equal 0";
        }else{
            return "Error : the parameters is invalid";
        }
        return (hours + "h" + " " + remainingMinutes + "m" + " "  + remainingSec + "s");
    }

    public static void showResult(int result){
        System.out.println(result);
    }
    public static void showResult(String result){
        System.out.println(result);
    }
    public static void showResult(double result){
        System.out.println(result);
    }
    public static void showResult(int resultOne , int resultTwo){
        System.out.println(resultOne + " " + resultTwo);
    }
}
