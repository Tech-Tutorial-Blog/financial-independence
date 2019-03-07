package utils;

public class ReturnsCalculator {

//    public static double getAnnualReturns()

    public static double getExpectedResultsFromCAGR(double endingBalance,double beginigBalance,double numberOfYears){
        double returns;
        return returns = Math.pow((endingBalance/beginigBalance),(1/numberOfYears))-1;
    }
}
