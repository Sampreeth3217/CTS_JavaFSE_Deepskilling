public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T101", "Design UI", "Pending"));
        manager.addTask(new Task("T102", "Develop Backend", "In Progress"));
        manager.addTask(new Task("T103", "Testing", "Not Started"));

        System.out.println("\n--- All Tasks ---");
        manager.listTasks();

        System.out.println("\n--- Search Task T102 ---");
        Task t = manager.searchTask("T102");
        System.out.println(t != null ? t : "Task not found.");

        System.out.println("\n--- Delete Task T102 ---");
        manager.deleteTask("T102");

        System.out.println("\n--- All Tasks After Deletion ---");
        manager.listTasks();
    }
}
