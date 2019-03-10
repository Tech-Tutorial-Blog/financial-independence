package utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;
import static utils.ReturnsCalculator.getExpectedResultsFromCAGR;
import static utils.ReturnsCalculator.getLumpSumCalculator;

public class ReturnsCalculatorTest {
    @Test
    public void testCagr(){
        Assertions.assertThat(getExpectedResultsFromCAGR(4000,1000,2)).isEqualTo(1);
    }

    @Test
    public void testLumsumReturns(){
        Assertions.assertThat(getLumpSumCalculator(1000,0.5,5,4)).isEqualTo(10545.0938424492);
    }

}