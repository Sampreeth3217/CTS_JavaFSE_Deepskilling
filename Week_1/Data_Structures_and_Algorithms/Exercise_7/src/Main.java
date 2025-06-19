public class Main {
    public static void main(String[] args) {
        double principal = 10000;  // ₹10,000 initial investment
        double rate = 0.05;        // 5% annual growth
        int years = 5;

        System.out.println("Recursive Value after " + years + " years:");
        double recursive = Forecast.futureValueRecursive(principal, rate, years);
        System.out.printf("Future Value: ₹%.2f\n", recursive);

        System.out.println("\n Optimized (Memoized) Value:");
        double[] memo = new double[years + 1];
        double memoized = Forecast.futureValueMemo(principal, rate, years, memo);
        System.out.printf("Future Value: ₹%.2f\n", memoized);

        System.out.println("\n Iterative Value:");
        double iterative = Forecast.futureValueIterative(principal, rate, years);
        System.out.printf("Future Value: ₹%.2f\n", iterative);
    }
}
