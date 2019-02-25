package calculator.strategies;

import calculator.FinanceCalculation;
import enums.Strategies;
import org.springframework.stereotype.Service;

@Service
public interface InvestmentStrategies extends FinanceCalculation {
    default Strategies getStrategy() {
        return Strategies.INVEST;

    }
}
