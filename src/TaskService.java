import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {

    private final ArrayList<Task> tasks = new ArrayList<>();

    public  void displayTasks() {
       if(tasks.isEmpty()){
           System.out.println("No tasks at hand");
           return;
       }
       int i=1;
       for(Task t:tasks){
           System.out.println(i++ +" "+ t);
       }
    }

    public void createTask(Scanner sc) {
        System.out.println("Task title: ");
        String t = sc.nextLine();
        System.out.println("Task description:");
        String d = sc.nextLine();
        Task item = new Task(t,d);
        tasks.add(item);
        System.out.println("Task has been added successfully");
    }

    public void changeStatus(int id){
       for(Task t:tasks){
           if(t.id==id){
               t.completed = !t.completed;
               return;
           }
       }
       System.out.println("Task not found.");
    }

    public void deleteTask(int id){
        boolean removed = tasks.removeIf(t->t.id==id);
        if(removed){
            System.out.println("Task removed successfully");
        }
        else {
            System.out.println("Task does not exist");
        }
    }
}
