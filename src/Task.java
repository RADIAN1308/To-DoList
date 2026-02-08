public class Task {
    private static int count=1;
    int id;
    String title;
    String taskDescription;
    boolean completed;
    public Task(String Title,String taskDescription)
    {
        this.id = count++;
        this.title = Title;
        this.taskDescription =taskDescription;
        completed = false;
    }

    @Override
    public String toString(){
        return " > "+title+" : "+taskDescription+" "+(completed?"DONE":"PENDING")+"\ttask ID:("+id+")";
    }
}
