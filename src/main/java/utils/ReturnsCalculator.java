package utils;

public class ReturnsCalculator {

//    public static double getAnnualReturns()

    public static double getExpectedResultsFromCAGR(double endingBalance, double beginigBalance, double numberOfYears) {
        return Math.pow((endingBalance / beginigBalance), (1 / numberOfYears)) - 1;
    }

    public static double getLumpSumCalculator(double principalAmount, double rateOfInterest, double numberOfYears, double numberOfPeriods) {
        return ( (principalAmount) * Math.pow((1 + (rateOfInterest / numberOfPeriods)), (numberOfYears *numberOfPeriods)));
    }
}
