package calculator.strategies;

import calculator.FinanceCalculation;
import enums.Strategies;
import org.springframework.stereotype.Service;

@Service
public interface SavingsStrategies extends FinanceCalculation {

    default Strategies getStrategy() {
        return Strategies.SAVINGS;
    }
}
