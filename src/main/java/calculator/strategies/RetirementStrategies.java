package calculator.strategies;

import enums.Strategies;
import org.springframework.stereotype.Service;

@Service
public interface RetirementStrategies {
    default Strategies getStrategy() {
        return Strategies.RETIREMENT;

    }
}
