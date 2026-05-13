public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold > 19 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double calculatedSalary = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return 2000.0 < calculatedSalary ? 2000.0 : calculatedSalary;
    } 
}
