public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E101", "Alice", "Manager", 90000));
        manager.addEmployee(new Employee("E102", "Bob", "Developer", 60000));
        manager.addEmployee(new Employee("E103", "Charlie", "Designer", 55000));

        System.out.println("\n--- All Employees ---");
        manager.listEmployees();

        System.out.println("\n--- Search for Employee E102 ---");
        Employee emp = manager.searchEmployee("E102");
        System.out.println(emp != null ? emp : "Not found.");

        System.out.println("\n--- Delete Employee E102 ---");
        manager.deleteEmployee("E102");

        System.out.println("\n--- All Employees After Deletion ---");
        manager.listEmployees();
    }
}
