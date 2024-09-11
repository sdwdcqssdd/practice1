import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(String name, int age) {
        boolean contain = false;
        for (Employee employee: employees) {
            if (employee.getName().equals(name)) {
                contain = true;
                break;
            }
        }
        if (!contain) {
            employees.add(new Employee(name, age));
        }
    }
    public void deleteEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }
    public void printEmployees() {
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        for (Employee emp: employees) {
            System.out.println(emp.getName() + " " + emp.getAge());
        }
    }
}
