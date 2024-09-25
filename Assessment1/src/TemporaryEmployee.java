class TemporaryEmployee extends Employee {
    int dailyWages;
    int noOfDays;


    public TemporaryEmployee(int id, String name, int dailyWages, int noOfDays) {
        this.employeeId = id;
        this.name = name;
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        calculateSalary();
        calculateBonus();
    }


    private void calculateSalary() {
        netSalary = dailyWages * noOfDays;
    }

    private void calculateBonus() {
        if (dailyWages < 1000) {
            bonus = 0.15f * netSalary;
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailyWages >= 1500 && dailyWages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }
}

