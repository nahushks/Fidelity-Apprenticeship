public class Employee {
    protected int employeeId;
    protected String name;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        if (this instanceof PermanentEmployee) {
            System.out.println("PF: " + ((PermanentEmployee) this).pf);
        } else if (this instanceof TemporaryEmployee) {
            System.out.println("Daily Wages: " + ((TemporaryEmployee) this).dailyWages);
            System.out.println("No. of Days Worked: " + ((TemporaryEmployee) this).noOfDays);
        }
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}


