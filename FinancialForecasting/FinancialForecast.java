package FinancialForecasting;

public class FinancialForecast {

    public static double forecast(double presentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        
        return forecast(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}
