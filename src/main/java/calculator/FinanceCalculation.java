package calculator;

import enums.Strategies;
import org.springframework.stereotype.Service;

@Service
public interface FinanceCalculation {

    /**
     * Method for calculating strategies based on need.
     */
    void generateStrategy();

    /**
     * Method to implement strategies.
     * @return
     */
    Strategies strategies();
}
