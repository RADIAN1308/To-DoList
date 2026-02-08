import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskService service = new TaskService();

        while (true) {
            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Change Task Status");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> service.createTask(sc);
                case 2 -> service.displayTasks();
                case 3 -> {
                    System.out.print("Enter task id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    service.changeStatus(id);
                }
                case 4 -> {
                    System.out.print("Enter task id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    service.deleteTask(id);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
