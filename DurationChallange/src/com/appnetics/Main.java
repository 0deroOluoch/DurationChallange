package com.appnetics;

public class Main {

    public static void main(String[] args) {
        getDurationString(20000,34);

    }
    public static void getDurationString(double minutes, double seconds){
        if ((minutes < 0) && (seconds < 0 && seconds > 59) ){
            System.out.println("Invalid Value");
        }else {

            //take seconds get modulus 60, what you get is remaining seconds.
            double remainingSeconds = seconds % 60;


            //take seconds, divide by 60, what you get put on to minutes.
            double minutesFromSeconds = seconds / 60;

            //take minutes, modulus 60, what you get, is the minutes remaining.
            double moreMinutes = (minutesFromSeconds + minutes) % 60;


            //take minutes, divide by 60, what you get, put to hours.
            double hoursFromMinutes = moreMinutes / 60;

            System.out.println( hoursFromMinutes + "h " + moreMinutes + "m " +remainingSeconds+ "s" );

        }
    }
}
