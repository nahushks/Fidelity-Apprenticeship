import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter the employee names (type 'exit' to finish):");

        while (true){
            String input = sc.nextLine();
            if ("exit".equalsIgnoreCase(input)){
                break;
            }
            employees.add(new Employee(input));
        }
        List<Employee>
                filteredEmployees=employees.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Employees whose names starts with A:");
        filteredEmployees.forEach(e-> System.out.println(e.getName()));
    }
}
