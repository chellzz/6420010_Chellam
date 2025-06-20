public class FinancialForecasting {

    static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
        }
    }

    static void showComplexityInfo() {
        System.out.println("\n Time Complexity Info:");
        System.out.println("- Recursive Time Complexity: O(n)");
        System.out.println("- Recursive Space Complexity: O(n) (due to call stack)");
        System.out.println("- Iterative approach would reduce space to O(1)\n");
    }

    public static void main(String[] args) {
        // ✅ Using predefined values instead of user input
        double pv = 5000.0;         // Present Value
        double rate = 0.08;         // Annual Growth Rate (8%)
        int years = 10;             // Investment Period in years

        System.out.println(" Financial Forecasting Tool (Sample Run)\n");
        System.out.printf(" Present Value: ₹%.2f\n", pv);
        System.out.printf(" Annual Growth Rate: %.2f%%\n", rate * 100);
        System.out.println(" Number of Years: " + years);

        double fv = futureValue(pv, rate, years);
        System.out.printf("\n Predicted Future Value after %d years: ₹%.2f\n", years, fv);

        showComplexityInfo();
    }
    
}
