public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.addEmployee("A",24);
        system.addEmployee("B",27);
        system.addEmployee("C", 23);
        system.deleteEmployee("B");
        system.addEmployee("A",34);
        system.addEmployee("D",23);
        system.printEmployees();
    }
}
