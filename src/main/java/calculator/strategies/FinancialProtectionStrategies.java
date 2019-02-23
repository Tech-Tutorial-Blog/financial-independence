package calculator.strategies;

import calculator.FinanceCalculation;
import enums.Strategies;
import org.springframework.stereotype.Service;

@Service
public interface FinancialProtectionStrategies extends FinanceCalculation {
    default Strategies getStrategy() {
        return Strategies.FINANCIAL_PROTECTION;

    }

}
