
class PermanentEmployee extends Employee {
    int pf;


    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        this.employeeId = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.pf = pf;
        calculateSalary();
        calculateBonus();
    }


    private void calculateSalary() {
        netSalary = basicSalary - pf;
    }


    private void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.10f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }
}

