package utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;
import static utils.ReturnsCalculator.getExpectedResultsFromCAGR;

public class ReturnsCalculatorTest {
    @Test
    public void testCagr(){
        Assertions.assertThat(getExpectedResultsFromCAGR(4000,1000,2)).isEqualTo(1);
    }

}