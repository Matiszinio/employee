public class fbmanager extends manager {
    public fbmanager(String name, double salary) {
        super(name, salary);
    }

    private double budget = 100000;
    private double sum = 0;

    public void Hire() {
        if (isHire() == true) {
            sum = sum + salary;
        }
    }
    /*public double employeeCount;
    public void hireTwo() {
        if(isHire()==true) {
            for (double i = budget; i <= 15_000; i = i - salary) {
                employeeCount++;
            }
        }
    } - IS THAT CORRECT? */


    public boolean isHire() {
        return sum < budget;
    }

    public boolean isSatisfied() {
        return salary > 20_000 && budget > 75_000;
    }
}
